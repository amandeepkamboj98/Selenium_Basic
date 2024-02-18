//Synchronization
// to see without wait hello world is display
//if find element is open in 1s than it will come out and perform next operation not wait

package Web_Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImplicitWait { //dynamic wait
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// this wait is applicable throughout the program and handle all delay in the program
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("Setup Complete");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();

        driver.findElement(By.xpath("//button[text()='Start']")).click();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //  WebDriverWait wait=new WebDriverWait(driver,30);

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Hello World!']")));
        //System.out.println(driver.findElement(By.xpath("//*[text()='Hello World!']")).getSize());
       // Thread.sleep(5000);
        List<WebElement> list= driver.findElements(By.xpath("//*[text()='Hello World!']"));
        System.out.println(list.size());
    }
}