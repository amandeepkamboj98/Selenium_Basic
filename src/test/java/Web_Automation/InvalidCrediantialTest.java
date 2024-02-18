package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvalidCrediantialTest {
    public static void main(String[] args) {
        Xls_Reader xl = new Xls_Reader(System.getProperty("user.dir")+"\\Testdata.xlsx");
        int row= xl.getRowCount("Sheet1");
        for(int i=2;i<=row;i++)
        {
         String testcase= xl.getCellData("Sheet1","TestCase",i);

         if(testcase.equals("TC01_invalidCredential")){
             String URL=xl.getCellData("Sheet1","url",i);
             String uname=xl.getCellData("Sheet1","username",i);
             String pass=xl.getCellData("Sheet1","password",i);

             WebDriverManager.edgedriver().setup();
             WebDriver driver =new EdgeDriver();
             driver.get(URL);
             driver.manage().window().maximize();
             driver.findElement(By.name("email")).sendKeys(uname);
             driver.findElement(By.name("password")).sendKeys(pass);

             driver.findElement(By.xpath("//button[@type='submit']")).click();

             Boolean access=driver.findElement(By.xpath("//div[text()=' Warning: No match for E-Mail Address and/or Password.']")).isDisplayed();

             System.out.println(" all are good in the world");

            if(access)
            {
                xl.setCellData("Sheet1","Result",i,"Login functionality is not working");
            }
            else{
                xl.setCellData("Sheet1","Result",i,"Failed");
            }
         }
           else
         {
             System.out.println("testcase is not found in excel sheet");
         }
        }
    }
}