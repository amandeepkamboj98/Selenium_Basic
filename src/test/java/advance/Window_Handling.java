package advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class Window_Handling {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        System.out.println("Setup Completed");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@class='blinkingText']")).click();

        Set<String> win = driver.getWindowHandles();
        Iterator<String> itr= win.iterator();
    //    String parentId = itr.next();
        String childID = itr.next();
        driver.switchTo().window(childID);

//        System.out.println(driver.getTitle());
//
//        System.out.println(driver.findElement(By.xpath("(//*[@class='im-para'])[1]")).getText());
//        System.out.println(driver.findElement(By.xpath("//*[@class='im-para red']")).getText().split("at")[1].split("with")[0].trim());
//        String email = driver.findElement(By.xpath("//*[@class='im-para red']")).getText().split("at")[1].split("with")[0].trim();
//        driver.switchTo().window(parentId);
//        driver.findElement(By.name("username")).sendKeys(email);
//        driver.findElement(By.xpath("(//*[@class='checkmark'])[1]")).click();
//        System.out.println("Welcome............");
    }
}