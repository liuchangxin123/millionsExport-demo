package com.pluto.millionsExport.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.pluto.millionsExport.data.ExportData;
import com.pluto.millionsExport.jooqData.tables.records.MillionsDataRecord;
import com.pluto.millionsExport.repository.MillionsDataRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author pluto
 * @date 2023/5/10
 */
@Component
public class MillionDataListener implements ReadListener<ExportData> {

    private static final Log logger = LogFactory.getLog(MillionDataListener.class);

    @Resource
    private MillionsDataRepository millionsDataRepository;

    private final ExecutorService executorService = Executors.newFixedThreadPool(20);

    private final ThreadLocal<ArrayList<MillionsDataRecord>> millionList = ThreadLocal.withInitial(ArrayList::new);

    private static final AtomicInteger count = new AtomicInteger(1);
    private static final int batchSize = 10000;

    @Override
    public void invoke(ExportData exportData, AnalysisContext analysisContext) {
        MillionsDataRecord data = new MillionsDataRecord();
        data.setSalary(exportData.getSalary());
        data.setStaffNo(exportData.getStaffNo());
        data.setStartTime(exportData.getStartTime());
        data.setEndTime(exportData.getEndTime());
        millionList.get().add(data);
        if (millionList.get().size() >= batchSize) {
//            saveData();
            asyncSaveData();
        }
    }

    @Override
    @Transactional
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        logger.info("一个Sheet全部处理完");
        if (millionList.get().size() >= batchSize) {
            saveData();
        }
    }

    public void asyncSaveData() {
        if (!millionList.get().isEmpty()) {
            ArrayList<MillionsDataRecord> millions = (ArrayList<MillionsDataRecord>) millionList.get().clone();
            executorService.execute(new MillionDataRunnable(millions, millionsDataRepository));
            millionList.get().clear();
        }
    }

    public void saveData() {
        if (!millionList.get().isEmpty()) {
            millionsDataRepository.batchInsert(millionList.get());
            logger.info("第" + count.getAndAdd(1) + "次插入" + millionList.get().size() + "条数据");
            millionList.get().clear();
        }
    }
}
