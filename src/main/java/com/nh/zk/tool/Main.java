package com.nh.zk.tool;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("test.xlsx");
        String fileName = file.getName();
        InputStream ins = new FileInputStream(file);
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        Workbook wb = null;
        if (suffix.equals("xlsx")) {
            wb = new XSSFWorkbook(ins);
        } else {
            wb = new HSSFWorkbook(ins);
        }
        /**
         * 获取excel表单
         */
        Sheet select = wb.getSheetAt(0);
        Sheet judge = wb.getSheetAt(1);
        /**
         * line = 2 :从表的第三行开始获取记录
         *
         */
        if (null != select) {
            for (int i = 1; i < select.getLastRowNum() + 1; i++) {
                System.out.println(i);
                Row row = select.getRow(i);
                getValue(row, 9);
            }
        }

        if (null != judge) {
            for (int i = 0; i < judge.getLastRowNum() + 1; i++) {
                System.out.println(i);
                Row row = judge.getRow(i);
                getValue(row, 6);
            }
        }
    }

    private static void getValue(Row row, int count) {
        for (int i = 0; i < count; i++) {
            String title = row.getCell(i).getStringCellValue();
            System.out.println(title);
        }
    }
}
