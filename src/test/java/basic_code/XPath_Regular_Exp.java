package basic_code;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPath_Regular_Exp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.ptuexam.com/login"); // -> to hit the url
		driver.manage().window().maximize();
		System.out.println("set up completed by aman");

		// -> Syntax of XPath Regular Expression ->
		// //tagName[contains(@attribute,'value')]
		// when there is only one attribute is present and
		// its value is also numeric then we use regular expression, it contains subset
		// of actual value

		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("1801972");
		// XPath Regular Expression
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("k@mboj123");
		// XPath Regular Expression
		driver.findElement(By.xpath("//span[contains(@class,'MuiButton-label')]")).click();
		// XPath Regular Expression
	}
}
