package advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println("Setup Completed");
        driver.manage().window().maximize();

        Actions act = new Actions(driver); //driver converting webDriver object into Action class
        // pass driver because Actions class to get know where operation perform
        WebElement move = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
        Thread.sleep(5000);
        act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
        act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().doubleClick().build().perform();  // double-click on hello

        act.moveToElement(move).build().perform();  // move cursor on link
        act.moveToElement(move).contextClick().build().perform();  // right click on link
        System.out.println("welcome...........");
    }
}