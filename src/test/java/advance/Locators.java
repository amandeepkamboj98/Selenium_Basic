package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		//implicit wait - 2 seconds time out

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("rahul");

		driver.findElement(By.name("inputPassword")).sendKeys("hello123");

		driver.findElement(By.className("signInBtn")).click();

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);//

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); // 

		driver.findElement(By.id("chkboxOne")).click(); // to click on checkbox

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); // xpath regular expression
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText());
		
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] p")).getText(),"You are successfully logged in.");

		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();  // used text() method to find the element, //tagname[text()="value"]
	 
		//driver.close();

	}



}
