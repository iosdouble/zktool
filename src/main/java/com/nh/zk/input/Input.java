package com.nh.zk.input;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nh.zk.tool.Inst;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * com.nh.zk.input
 * create by admin
 * create time 2020/9/23
 * version 1.0
 **/
public class Input {
    public static int count = 1;

    public static void main(String[] args) throws Exception {
        List<String> files = getFiles("F:\\村干部信息系统收资料（2020.9.20）(1)\\村干部信息系统收资料（2020.9.20）\\A");
        System.out.println(files);
        System.out.println(files.size());

        for (String filePaht : files) {
            getExcelContent(filePaht);
        }
        System.out.println(count);
    }


    private static void getExcelContent(String filePath) throws IOException {
        File file = new File(filePath);
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
        System.out.println(filePath);
        System.out.println(count++);
        for (int i = 1; i < 16; i++) {
            Row row = select.getRow(i);
            if (row.getCell(1) == null) {
                break;
            }
            System.out.println(row.getCell(1));
            System.out.println(row.getCell(3));
        }
    }

    /**
     * @Author：
     * @Description：获取某个目录下所有直接下级文件，不包括目录下的子目录的下的文件，所以不用递归获取
     * @Date：
     */
    public static List<String> getFiles(String path) {
        List<String> files = new ArrayList<String>();
        File file = new File(path);
        File[] tempList = file.listFiles();

        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                files.add(tempList[i].toString());
                //文件名，不包含路径
                //String fileName = tempList[i].getName();
            }
            if (tempList[i].isDirectory()) {
                //这里就不递归了，
            }
        }
        return files;
    }
}
