package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;

public class Enabled_Com {
    public static WebDriver driver;
    public static void main(String args[]) throws InterruptedException, IOException {
        try {
            WebDriverManager.edgedriver().setup();
            WebDriver driver = new EdgeDriver();
            driver.get("https://demo.opencart.com/index.php?route=account/login");
            driver.manage().window().maximize();
            driver.findElement(By.name("email")).isEnabled(); // isDisplayed() method returns boolean value
            driver.findElement(By.name("password")).isEnabled();
            System.out.println("Test case passed");
            }
            catch (Exception e) {
            e.printStackTrace();
            System.out.println("Test case is failed");

                     // no take screenshot error in 32 line
             TakesScreenshot st = (TakesScreenshot) driver; //casting converting webDriver object driver into TakesScreenshot interface
              File src = st.getScreenshotAs(OutputType.FILE);// take screenshot and save in ram somewhere
                FileUtils.copyFile(src, new File("D:\\Aman Work\\GoogleFailure.png"));
        }
        System.out.println("Welcome.....");
    }
     
}