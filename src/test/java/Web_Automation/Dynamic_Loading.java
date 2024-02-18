package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_Loading {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("Setup Complete");

        driver.manage().window().maximize();
        driver.findElement(By.linkText("Dynamic Loading")).click();
       // driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
        driver.findElement(By.xpath("//button[text()='Start']")).click();

        //Thread.sleep(3000);

        WebDriverWait wait=new WebDriverWait(driver,30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Hello World!']")));
        System.out.println(driver.findElement(By.xpath("//*[text()='Hello World!']")).getSize());
    }

    }

