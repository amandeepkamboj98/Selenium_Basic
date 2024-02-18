package advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {
    public static void main(String[] args) throws InterruptedException {
        String name = "You are successfully logged in.";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxTwo")).click(); // -> to click on checkbox
        driver.findElement(By.id("chkboxOne")).click(); // -> to click on checkbox
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(5000);
        //    System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/p")).getText()); // parent child relationshio of xpath

        System.out.println(driver.findElement(By.tagName("p")).getText());

        //  System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText());

        // Assertion is used to compare the our actual result with the expected result if not matched then show error and it not show result on console

        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] p")).getText(), name);

        System.out.println("welcome............");
    }
}

