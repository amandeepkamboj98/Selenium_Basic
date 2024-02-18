package advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		// Dynamic Dropdown -> these dropdowns perform action based on user action

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("(//a[@value='BLR'])[1]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); // if same
		// element in both boxes , we have to give index of that side element

		driver.findElement(By.xpath("//*[text()='20']")).click();

		driver.findElement(By.xpath("//*[@name='ctl00$mainContent$view_date2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='30']")).click();

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		Select s = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		s.selectByIndex(2);
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println("welcome...");
	}
}
