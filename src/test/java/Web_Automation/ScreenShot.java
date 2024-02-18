package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ScreenShot {
   public static WebDriver  driver ; // we're calling driver variable under the static method, so we create driver variable as static
    public static void main(String[] args) throws InterruptedException, IOException {

        try {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.get("https://googles.com");
            System.out.println("Setup Completed");
            driver.manage().window().maximize();

            List<WebElement> lst = driver.findElements(By.name("q"));

            System.out.println("Test case is passed");
        }
        catch (Exception e) {
            System.out.println("Test case is failed");
            Thread.sleep(3000);

            //driver is a reference of WebDriver interface
            TakesScreenshot st = (TakesScreenshot) driver; //casting converting webDriver object driver into TakesScreenshot interface
            File src = st.getScreenshotAs(OutputType.FILE);// take screenshot and save in ram somewhere
            FileUtils.copyFile(src, new File("D:\\Aman Work\\GoogleFailure.png")); // copy all screenshot from ram to new file
        }
    }
}