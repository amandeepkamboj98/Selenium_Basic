package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getCSS_Value {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.manage().window().maximize();
        System.out.println("Setup Completed by Aman");
        driver.findElement(By.name("email")).sendKeys("Amandeep");
        String actualValue =driver.findElement(By.className("btn-primary")).getCssValue("font"); // to get the css property
        System.out.println(actualValue);
    }
}