package com.example.spring.export;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 导出
 */
@Service
public class ExportServiceImpl implements IExportService {
    /**
     * 导出Excel
     *
     * @param response
     * @param taskId
     */
    @Override
    public void exportExcel(HttpServletResponse response, Integer taskId) {
        try {
            //result 要导出的结果集
            //List list = listResult();
            List list = new ArrayList();
            //workbook Excel中的一个工作簿
            HSSFWorkbook workbook = new HSSFWorkbook();
            //sheet Excel中的一个sheet
            HSSFSheet sheet = workbook.createSheet("sheet1");
            //headerRowNum sheet表头行(顶行)索引
            int headerRowNum = 0;
            //headerRow 在sheet表创建头行(顶行)
            HSSFRow headerRow = sheet.createRow(headerRowNum);
            //在headerRow行创建单元格1(第1列)
            HSSFCell headerCell1 = headerRow.createCell(0);
            //给headerRow行的单元格1赋值
            headerCell1.setCellValue("序号");
            HSSFCell headerCell2 = headerRow.createCell(1);
            headerCell2.setCellValue("项目");
            HSSFCell headerCell3 = headerRow.createCell(2);
            headerCell3.setCellValue("内容");
            HSSFCell headerCell4 = headerRow.createCell(3);
            headerCell4.setCellValue("审查结果");
            //headerRow行下面的结果集行索引,初始值为headerRow行索引+1
            int valueRowNum = headerRowNum + 1;
            for (int i = 0; i < list.size(); i++) {
                //在sheet表创建一行,索引为valueRowNum
                HSSFRow valueRow = sheet.createRow(valueRowNum);
                //在valueRow创建单元格1
                HSSFCell valueCell1 = valueRow.createCell(0);
                //给valueCell1赋值,其值从result结果集中获取
                //valueCell1.setCellValue(list.get(i).getCode());
                HSSFCell valueCell2 = valueRow.createCell(1);
                //valueCell2.setCellValue(list.get(i).getProject());
                HSSFCell valueCell3 = valueRow.createCell(2);
                //valueCell3.setCellValue(list.get(i).getContent());
                HSSFCell valueCell4 = valueRow.createCell(3);
                //valueCell4.setCellValue(list.get(i).getResult());
                //valueRowNum索引+1
                valueRowNum++;
            }
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            workbook.write(out);
            byte[] bytes = out.toByteArray();
            response.setContentType("application/x-msdownload");
            response.setHeader("Content-Disposition", "attachment;filename=" + new String("Excel名称".getBytes("gb2312"), "ISO8859-1") + ".xls");
            response.setContentLength(bytes.length);
            response.getOutputStream().write(bytes);
            response.getOutputStream().flush();
            response.getOutputStream().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 导入Excel
     *
     * @param file
     * @param taskId
     */
    @Override
    public void importExcel(MultipartFile file, Integer taskId) {
        //读取Excel数据存入list
        List list = new ArrayList();
        try {
            if (!file.getOriginalFilename().endsWith("xls")) {
                System.out.println("Excel格式不支持");
            } else {
                HSSFWorkbook workbook = new HSSFWorkbook(file.getInputStream());
                //获取第1个sheet
                HSSFSheet sheet = workbook.getSheetAt(0);
                //从第1行开始读(第0行是标题行)
                for (int i = 1; i < sheet.getLastRowNum(); i++) {
                    HSSFRow row = sheet.getRow(i);
                    if (null == row) {
                        continue;
                    }
                    //处理当前行
                    //...
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
