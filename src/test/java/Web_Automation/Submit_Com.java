package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Submit_Com {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.manage().window().maximize();
        System.out.println("Setup Completed by Aman");
        driver.findElement(By.name("email")).sendKeys("Amandeep");
         driver.findElement(By.name("/html/body/div[2]/div/div/div/div[2]/div/form/input")).submit(); // submit used for to submit on any button like click

    }
}
