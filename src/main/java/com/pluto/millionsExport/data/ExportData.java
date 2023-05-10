package com.pluto.millionsExport.data;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author pluto
 * @date 2023/5/10
 */
@Data
public class ExportData {

    @ExcelProperty("员工号")
    private Long staffNo;

    @ExcelProperty("薪水")
    private BigDecimal salary;

    @ExcelProperty("开始时间")
    @DateTimeFormat("yyyy-MM-dd")
    private LocalDateTime startTime;

    @ExcelProperty("结束时间")
    @DateTimeFormat("yyyy-MM-dd")
    private LocalDateTime endTime;
}
