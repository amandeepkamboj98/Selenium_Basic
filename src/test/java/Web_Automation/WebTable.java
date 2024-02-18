package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {
    public static void main(String[] args) {
            WebDriverManager.edgedriver().setup();
            WebDriver driver=new EdgeDriver();

            driver.get("E:\\WbTable.html");
           // driver.get("C:\\Users\\parde\\OneDrive\\Desktop\\Table.html");
            System.out.println("Setup Complete");

            driver.manage().window().maximize();
            //System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[1]")).getText());
            System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText());
           //System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]")).getText());

    }
}
