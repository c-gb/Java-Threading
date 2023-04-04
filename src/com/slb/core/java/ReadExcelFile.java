package com.slb.core.java;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class ReadExcelFile {

    public static void main(String[] args) {
        String fileLocation = "C:\\java\\book.xls";
        readExcelFile(fileLocation);
    }

    private static void readExcelFile(String fileLocation) {
        Workbook workbook = null;

        try {
            workbook = Workbook.getWorkbook(new File(fileLocation));

            Sheet sheet = workbook.getSheet(0);
            Cell cell1 = sheet.getCell(0, 0);
            System.out.print(cell1.getContents() + ":");
            Cell cell2 = sheet.getCell(0, 1);
            System.out.println(cell2.getContents());

            Cell cell3 = sheet.getCell(1, 0);
            System.out.print(cell3.getContents() + ":");
            Cell cell4 = sheet.getCell(1, 1);
            System.out.println(cell4.getContents());

            Cell cell5 = sheet.getCell(2, 1);
            System.out.println(cell5.getContents());


            System.out.print(cell1.getContents() + ":");
            cell2 = sheet.getCell(0, 2);
            System.out.println(cell2.getContents());

            System.out.print(cell3.getContents() + ":");
            cell4 = sheet.getCell(1, 2);
            System.out.println(cell4.getContents());

            Cell cell6 = sheet.getCell(2, 1);
            System.out.println(cell6.getContents());

            System.out.print(cell3.getContents() + ":");
            cell4 = sheet.getCell(1, 2);
            System.out.println(cell4.getContents());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        } finally {

            if (workbook != null) {
                workbook.close();
            }

        }

    }
    }

