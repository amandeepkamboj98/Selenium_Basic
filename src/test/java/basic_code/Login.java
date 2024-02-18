package basic_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://login.salesforce.com/?locale=us"); // -> to hit the url
		driver.manage().window().maximize();
		System.out.println("set up completed by aman");
		
		   driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
	        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("k@mboj123"); // we write xpath, id, name etc.. also here
	        driver.findElement(By.id("Login")).click();

	        System.out.println(driver.findElement(By.id("error")).getText());  // to get the error message on the console using id locator
	        // System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());  // to get the error message on the console
	        // System.out.println(driver.findElement(By.className("loginError")).getText());  // to get the error message on the console
	        //  System.out.println(driver.findElement(By.cssSelector("#error")).getText());  // to get the error message on the console using CSS locator

	        System.out.println("url is opened............");

	        // driver.findElement(By.className("button r4 wide primary")).click(); // space between the value of class name locator is not accepted
	          driver.findElement(By.id("forgot_password_link")).click();
	           driver.findElement(By.id("un")).sendKeys("amandeep");
	           driver.findElement(By.id("continue")).click();
	          System.out.println(driver.findElement(By.xpath("//*[@id='forgotPassForm']/div[1]/div")).getText());  // Parent-child

	      //  driver.findElement(By.linkText("Forgot Your  Password?")).click(); // linkText is used when object is link and have no any id, className, name locators
	      //  driver.findElement(By.linkText("Use Custom Domain")).click(); // here we use linkText locator, it is only for link type object
	}
}