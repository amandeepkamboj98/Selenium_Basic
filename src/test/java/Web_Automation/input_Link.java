package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class input_Link {
    public static void main(String[] args) {


        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://the-internet.herokuapp.com");
        System.out.println("Setup Complete");

        driver.manage().window().maximize();

        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("12"); //send keys used for select a value from dropdown
    }
}