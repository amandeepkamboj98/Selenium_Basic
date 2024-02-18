package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Simple_Alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("E:\\SimpleAlert.html");
        System.out.println("Setup Complete");
        driver.manage().window().maximize();

        //Actions Class

        driver.findElement(By.xpath("/html/body/fieldset/button")).click();
        Thread.sleep(3000);
        System.out.println( driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss(); // accept() and dismiss() are used when alert page have ok and cancel button

    }
}
