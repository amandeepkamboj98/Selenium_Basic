package Web_Automation;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReadData {
    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\TestData.xlsx");
        XSSFWorkbook wb= new XSSFWorkbook(file); // xlxs workbook
        XSSFSheet sheet=wb.getSheetAt(0);  // go into workbook sheet
        int row = sheet.getLastRowNum(); // it finds data until last row
        int col=sheet.getRow(1).getLastCellNum(); // to count cell number in first row
        System.out.println(row);
        System.out.println(col);

        for(int i = 0; i <= row; i++)
        {
            for(int j = 0;j <= col-1; j++)
            {
                System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
            }
        }
       // System.out.println(sheet.getRow(0).getCell(0).getStringCellValue()); // value of o row 0 col
       // System.out.println(sheet.getRow(1).getCell(0).getStringCellValue()); // value of 1 row 0 col
       // System.out.println(sheet.getRow(0).getCell(1).getStringCellValue()); // value of o row 1 col
       // System.out.println(sheet.getRow(1).getCell(1).getStringCellValue()); // value of 1 row 1 col

    }
}
