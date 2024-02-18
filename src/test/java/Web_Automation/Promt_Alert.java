package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Promt_Alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("E:/Prompt.html");
        System.out.println("Setup Complete");
        driver.manage().window().maximize();

        //Actions Class

        driver.findElement(By.xpath("/html/body/fieldset/button")).click(); // click on me button path
        Thread.sleep(5000);
        driver.switchTo().alert().sendKeys("Amandeep");// enter name on prompt box alert

        System.out.println( driver.switchTo().alert().getText()); // print data of prompt box on console
        Thread.sleep(5000);
        driver.switchTo().alert().accept(); // accept() and dismiss() are used when alert page have ok and cancel button

    }
}
