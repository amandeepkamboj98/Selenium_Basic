package basic_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Parent_Child {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxTwo")).click(); // -> to click on checkbox
		driver.findElement(By.id("chkboxOne")).click(); // -> to click on checkbox

		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(5000);

		// syntax -> //tagname[@attribute='value']/tagname/tagname[index]/tagname ->
		// until we cannot reach to out requirement
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/p")).getText()); 
		// parent child relationship of xpath

		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h1")).getText()); 
		// paren child relationship of xpath

		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] p")).getText(),
				"You are successfully logged in.");
		System.out.println("welcome............");
	}
}