package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ExplicitWait {  // it is web driver wait, it is conditional based wait

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("Setup Complete");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
        driver.findElement(By.xpath("//button[text()='Start']")).click();

        // Thread.sleep(10000); //static wait ,only work for particular condition

        // not applicable throughout the program, based on the condition, (WebDriverWait is Explicit wait)

        WebDriverWait wait=new WebDriverWait(driver,30);// max. time to validate this condition in 30s. then move
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Hello World!']")));// condition you verify

        List<WebElement> list = driver.findElements(By.xpath("//*[text()='Hello World!']"));
        System.out.println(list.size());
    }
}