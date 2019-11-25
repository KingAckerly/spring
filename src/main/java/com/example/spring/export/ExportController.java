package com.example.spring.export;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * 导出
 */
@RestController
@RequestMapping(value = "/export")
public class ExportController {
    /**
     * 导出
     */
    @Autowired
    private IExportService exportService;

    /**
     * 导出Excel
     *
     * @param response
     * @param taskId
     */
    @RequestMapping(value = "/exportExcel", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public void exportExcel(HttpServletResponse response, @RequestParam(value = "taskId") Integer taskId) {
        exportService.exportExcel(response, taskId);
    }


    /**
     * 导入Excel
     *
     * @param file
     * @param taskId
     */
    @RequestMapping(value = "/importExcel", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public void importExcel(MultipartFile file, @RequestParam(value = "taskId") Integer taskId) {
        exportService.importExcel(file, taskId);
    }
}
