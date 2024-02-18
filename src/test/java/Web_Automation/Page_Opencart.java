package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Page_Opencart {

    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();

        driver.get("https://demo.opencart.com/");
        System.out.println("Setup Complete");

        driver.manage().window().maximize();
        driver.findElement(By.linkText("Desktops")).click();
        //driver.findElement(By.linkText("input")).click();
        //driver.findElement(By.xpath("//input[@type='number']")).sendKeys("Aman");
    }
}
