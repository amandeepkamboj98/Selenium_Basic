package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SendKeys {

    public static void main(String[] args) {


        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://the-internet.herokuapp.com");
        System.out.println("Setup Complete");

        driver.manage().window().maximize(); // to maximize the window

        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.NUMPAD1); //sendkeys into input page number section
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.NUMPAD3);
    }
}
