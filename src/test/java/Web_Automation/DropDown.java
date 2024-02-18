package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDown {

    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("Setup Complete");

        driver.manage().window().maximize();
        driver.findElement(By.linkText("Dropdown")).click();
        //driver.findElement(By.xpath("//button[text()='Add Element']")).sendKeys("Option 1");
        driver.findElement(By.id("dropdown")).sendKeys("Option 1"); // send keys used for select value from dropdown
    }
}
