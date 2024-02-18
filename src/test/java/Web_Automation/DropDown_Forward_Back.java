package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDown_Forward_Back {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.navigate().to("https://the-internet.herokuapp.com/");
        System.out.println("Setup Complete");

        driver.manage().window().maximize();
        //Thread.sleep(3000);
        driver.findElement(By.linkText("Dropdown")).click();

       Thread.sleep(3000);
       driver.navigate().back();
       Thread.sleep(8000);
       driver.navigate().forward();
    }
}
