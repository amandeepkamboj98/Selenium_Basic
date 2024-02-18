package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=us");
		driver.manage().window().maximize();
		System.out.println("Set is created by aman...");
	    WebElement user_name =	driver.findElement(By.xpath("//*[@name='username']"));
	    user_name.sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("k@mboj123"); // we write xpath, id, name etc..
																						// also here
		driver.findElement(By.id("Login")).click();

		// System.out.println(driver.findElement(By.id("error")).getText()); // to get
		// the error message on the console using id locator
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText()); // to get the error message on
																						// the console

	}
}
