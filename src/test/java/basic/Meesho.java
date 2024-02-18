package basic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Meesho {
	public static void main(String[] args) throws InterruptedException {
		try {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.meesho.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("set up.......");

			// click on women ethnic
			WebElement women_ethnic = driver
					.findElement(By.xpath("(//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK'])[1]"));
			women_ethnic.click();

			// to click on All Sarees
			WebElement all_saree = driver.findElement(By.xpath("//p[normalize-space()='All Sarees']"));
			all_saree.click();

			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());

			// to select particular product from list
			// driver.findElement(By.xpath("//img[@alt='Ikkat Georgette saree']")).click();

			// to select first product from All Sarees list
			WebElement product_select = driver.findElement(By.xpath(
					"//div[@class='sc-gswNZR sc-hLBbgP JoMRc etQEgJ products']//div[@class='sc-dkrFOg ProductList__GridCol-sc-8lnc8o-0 cokuZA eCJiSA'][1]"));
			product_select.click();

			// driver.findElement(By.xpath("//div[@class='sc-dkrFOg
			// ggMaSF']/descendant::div[4]")).click(); Not stable

			// click on buy now button
			WebElement buyNow = driver.findElement(By.xpath(
					"//button[@class='sc-ezOQGI XUGGv ProductCard__SolidButtonBigStyled-sc-camkhj-1 dEqZtN ProductCard__SolidButtonBigStyled-sc-camkhj-1 dEqZtN']"));
			buyNow.click();

			// driver.findElement(By.xpath("//span[text()='Buy Now']")).click(); not stable

			// Enter your mobile number
			WebElement mobileNumber = driver.findElement(By.xpath("//input[@type='tel']"));
			mobileNumber.sendKeys("1234567890");

			System.out.println("Completed program....");
		} catch (Exception e) {
			System.out.println("Error occured" + e); // TODO: handle exception
		}
	}
}
