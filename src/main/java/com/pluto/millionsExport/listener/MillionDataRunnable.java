package com.pluto.millionsExport.listener;

import com.pluto.millionsExport.jooqData.tables.pojos.MillionsData;
import com.pluto.millionsExport.jooqData.tables.records.MillionsDataRecord;
import com.pluto.millionsExport.repository.MillionsDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author pluto
 * @date 2023/5/10
 */
@Component
public class MillionDataRunnable implements Runnable {

    private MillionsDataRepository millionsDataRepository;

    private List<MillionsDataRecord> millionList;

    public MillionDataRunnable(List<MillionsDataRecord> millionList, MillionsDataRepository millionsDataRepository) {
        this.millionList = millionList;
        this.millionsDataRepository = millionsDataRepository;
    }
    @Override
    public void run() {
        millionsDataRepository.batchInsert(millionList);
    }
}
