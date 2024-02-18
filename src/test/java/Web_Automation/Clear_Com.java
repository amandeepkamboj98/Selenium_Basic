package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Clear_Com {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        System.out.println("Setup Completed by Aman");
        driver.findElement(By.name("email")).sendKeys("xyz"); // send the data in the email field
        driver.findElement(By.name("password")).sendKeys("xyz"); //send the data into the password field

        Thread.sleep(3000);
        driver.findElement(By.name("email")).clear(); // clear the data from email field
        driver.findElement(By.name("password")).clear(); // clear the data from password field
    }
}
