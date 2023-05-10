package com.pluto.millionsExport.controller;

import com.pluto.millionsExport.service.MillionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 导入导出示例
 *
 * @author pluto
 * @date 2023/5/10
 */
@RestController
public class MillionController {

    @Resource
    private MillionService millionService;

    @GetMapping("/import")
    public void importExcel(MultipartFile file) throws IOException {
        millionService.importExcel(file);
    }

    @GetMapping("/export")
    public void exportExcel(HttpServletResponse response) throws IOException, InterruptedException {
        millionService.exportExcel(response);
    }

}
