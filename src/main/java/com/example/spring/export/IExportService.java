package com.example.spring.export;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * 导出
 */
public interface IExportService {
    /**
     * 导出Excel
     *
     * @param response
     * @param taskId
     */
    void exportExcel(HttpServletResponse response, Integer taskId);

    /**
     * 导入Excel
     *
     * @param file
     * @param taskId
     */
    void importExcel(MultipartFile file, Integer taskId);
}
