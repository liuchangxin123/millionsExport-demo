package com.pluto.millionsExport.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.pluto.millionsExport.data.ExportData;
import com.pluto.millionsExport.jooqData.tables.pojos.MillionsData;
import com.pluto.millionsExport.listener.MillionDataListener;
import com.pluto.millionsExport.repository.MillionsDataRepository;
import com.pluto.millionsExport.service.MillionService;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * @author pluto
 * @date 2023/5/10
 */
@Service
public class MillionExportServiceImpl implements MillionService {

    public static final String CONTENT_TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";


    @Resource
    private MillionDataListener millionDataListener;

    private ExecutorService executorService = Executors.newFixedThreadPool(20);

    @Resource
    private MillionsDataRepository millionsDataRepository;


    @Override
    public void exportExcel(HttpServletResponse response) throws InterruptedException, IOException {
        response.setContentType(CONTENT_TYPE);
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + "million.xlsx");

        Long count = millionsDataRepository.count();

        Integer pages = 20;
        Long size = count / pages;

        ExecutorService executorService = Executors.newFixedThreadPool(pages);
        CountDownLatch countDownLatch = new CountDownLatch(pages);

        Map<Integer, List<MillionsData>> pageMap = new HashMap<>();
        for (int i = 0; i < pages; i++) {
            int finalI = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    List<MillionsData> selectPage = millionsDataRepository.select(finalI + 1, size.intValue());
                    pageMap.put(finalI, selectPage);
                    countDownLatch.countDown();
                }
            });
        }

        countDownLatch.await();

        try (ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream(), ExportData.class).build()) {
            for (Map.Entry<Integer, List<MillionsData>> entry : pageMap.entrySet()) {
                Integer num = entry.getKey();
                List<MillionsData> salariesPage = entry.getValue();
                List<ExportData> collect = salariesPage.stream().map(s -> {
                    ExportData data = new ExportData();
                    data.setSalary(s.getSalary());
                    data.setStaffNo(s.getStaffNo());
                    data.setEndTime(s.getEndTime());
                    data.setStartTime(s.getStartTime());
                    return data;
                }).collect(Collectors.toList());
                WriteSheet writeSheet = EasyExcel.writerSheet(num, "模板" + num).build();
                excelWriter.write(collect, writeSheet);
            }
        }
    }

    @Override
    public void importExcel(MultipartFile file) throws IOException {
        // 也可以根据sheet页数创建对应的线程数来处理sheet
        Workbook workbook = new XSSFWorkbook(file.getInputStream());
        int numberOfSheets = workbook.getNumberOfSheets();
        // 开20个线程分别处理20个sheet
        List<Callable<Object>> tasks = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = i;
            tasks.add(() -> {
                EasyExcel.read(file.getInputStream(), ExportData.class, millionDataListener)
                        .sheet(num).doRead();
                return null;
            });
        }

        try {
            executorService.invokeAll(tasks);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
