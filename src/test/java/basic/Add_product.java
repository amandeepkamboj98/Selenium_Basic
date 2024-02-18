package basic;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_product {
	public static void main(String[] args) {
		try {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.tatacliq.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("set created by aman......");
			
			// Location popup
			driver.findElement(By.id("wzrk-cancel")).click();
			System.out.println( driver.getTitle());
			
			// Search Bar                                         Parent-child relationship
			WebElement search = driver.findElement(By.xpath("//div[@class='SearchHeader__searchWithInputRedHolder']/div/div/div/div/input")) ;
			//		driver.findElement(By.id("search-text-input"));
			search.sendKeys("Laptop Bags");
			search.sendKeys(Keys.ENTER);
			
			//click on item 
			driver.findElement(By.xpath("(//*[@class='ProductModule__dummyDiv'])[1]")).click();

			// Window Switching
			Set<String> win = driver.getWindowHandles();
		//	String parentId = win.toArray()[1].toString();
			String childID = win.toArray()[1].toString();
			driver.switchTo().window(childID);
			
			// Add item into Cart
			//WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement addCart = driver.findElement(By.xpath("//span[text()='ADD TO BAG']"));
			addCart.isDisplayed();
			Thread.sleep(3000);
			addCart.click();
			// add to cart open
			try {
				driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
				System.out.println( driver.getTitle());
				
				// selected item name
				String product_title = driver
						.findElement(By.xpath
								("//div[text()='Lavie Elly Beige Solid Medium Laptop Handbag']")).getText();
				System.out.println("Product name in Purchase summary : "+product_title); 
			}catch (Exception e) {
				driver.findElement(By.cssSelector(".EmptyBag__headingText")).isDisplayed();
				System.out.println("Element not added to the cart.");
			}
			System.out.println("..End..");
		} catch (Exception e) {
			System.out.println("Error occurred : " + e);
		}
	}
}
