package Web_Automation;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteData{
    public static void main(String[] args) throws IOException {
        FileInputStream fi= new FileInputStream(System.getProperty("user.dir")+"\\TestData.xlsx");
        XSSFWorkbook wb= new XSSFWorkbook(fi); // xlxs workbook
        XSSFSheet sheet=wb.getSheetAt(0);
        sheet.getRow(1).getCell(1).setCellValue("@m@n123"); // setCellValue used to set the value in cell of sheet

        FileOutputStream fw= new FileOutputStream(System.getProperty("user.dir")+"\\TestData.xlsx");
        wb.write(fw);
        wb.close();

    System.out.println("welcome......");

    }
}
