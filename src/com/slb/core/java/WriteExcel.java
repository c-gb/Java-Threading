package com.slb.core.java;
import jxl.Workbook;
import jxl.write.*;
import jxl.write.Number;

import java.io.File;
import java.io.IOException;


public class WriteExcel {
    public static void main(String[] args) {
        String fileLocation = "C:\\java\\book2.xls";
        writeExcelFile(fileLocation);
    }

    private static void writeExcelFile(String fileLocation) {
        WritableWorkbook myFirstWbook = null;
        try {

            myFirstWbook = Workbook.createWorkbook(new File(fileLocation));

            // create an Excel sheet
            WritableSheet excelSheet = myFirstWbook.createSheet("Sheet1", 0);

            // add something into the Excel sheet
            Label label = new Label(0, 0, "Simplified");
            excelSheet.addCell(label);

            Number number = new Number(0, 1, 1);
            excelSheet.addCell(number);

            label = new Label(1, 0, "Learning");
            excelSheet.addCell(label);

            label = new Label(1, 1, "Blog");
            excelSheet.addCell(label);

            number = new Number(0, 2, 2);
            excelSheet.addCell(number);

            label = new Label(1, 2, "Thanks!");
            excelSheet.addCell(label);

            myFirstWbook.write();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        } finally {

            if (myFirstWbook != null) {
                try {
                    myFirstWbook.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (WriteException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
