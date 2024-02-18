
// no longer document available like page, data etc. and element is not attached to the page particular document
// no element is present anymore permanently or within a particular session
package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaleElement_Expection {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        System.out.println("Setup Completed by Aman");
        driver.manage().window().maximize();
        WebElement user = driver.findElement(By.name("email"));

        user.sendKeys("aman");
        driver.navigate().refresh();
        //Thread.sleep(5000);
      //  user.sendKeys("deep");
System.out.println("Amandeep...");
    }
}