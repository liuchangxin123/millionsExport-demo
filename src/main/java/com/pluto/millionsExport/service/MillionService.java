package com.pluto.millionsExport.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author pluto
 * @date 2023/5/10
 */
public interface MillionService {

    /**
     * 导出
     * @param response
     */
    void exportExcel(HttpServletResponse response) throws InterruptedException, IOException;

    /**
     * 导入
     * @param file 文件
     */
    void importExcel(MultipartFile file) throws IOException;
}
