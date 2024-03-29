package basic_code;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSS_Sel_Locator {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.ptuexam.com/login");  // -> to hit the url
        driver.manage().window().maximize();
        System.out.println("set up completed by aman");

            // Syntax of CSS ->     tagName[attribute='value'] 0r *[attribute='value'] or [attribute='value']

        // driver.findElement(By.cssSelector("#username")).sendKeys("1801972"); // generated by browser
        //driver.findElement(By.cssSelector("#password")).sendKeys("k@mboj123"); // generated by browser
        // driver.findElement(By.cssSelector("button.MuiButtonBase-root:nth-child(3) > span:nth-child(1)")).click(); // generated by browser

        // driver.findElement(By.cssSelector("[type='text']")).sendKeys("1801972"); // generated by myself
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("1801972"); // generated by myself
        driver.findElement(By.cssSelector("*[id='password']")).sendKeys("k@mboj123"); // generated by myself
        driver.findElement(By.cssSelector("[class='MuiButton-label']")).click(); // generated by myself
    }
}
