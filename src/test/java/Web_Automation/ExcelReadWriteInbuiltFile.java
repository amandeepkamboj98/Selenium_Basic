package Web_Automation;

public class ExcelReadWriteInbuiltFile {
    public static void main(String[] args) {

        Xls_Reader xl = new Xls_Reader(System.getProperty("user.dir")+"\\Testdata.xlsx");
        int row= xl.getRowCount("Sheet1"); // actual num ber of row
        int col =xl.getColumnCount("Sheet1"); // actual num ber of column
        System.out.println(col);
        System.out.println(row);

        String data = xl.getCellData("Sheet1","password",2); //read data
         System.out.println(data);

        xl.setCellData("Sheet1","Result",2,"failed");
        xl.setCellData("Sheet1","Result",3,"Passed");
        xl.setCellData("Sheet1","username",3,"Pradeep");


    }
}
