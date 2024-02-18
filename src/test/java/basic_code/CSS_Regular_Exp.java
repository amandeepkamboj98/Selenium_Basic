package basic_code;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSS_Regular_Exp {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.ptuexam.com/login"); // -> to hit the url
		driver.manage().window().maximize();
		System.out.println("set up completed by aman");

		// Syntax CSS Regular Expression -> tagName[attribute*='value'] -> when there is
		// only one attribute is present and
		// its value is also numeric then we use regular expression, it has subset of actual value
	

		driver.findElement(By.cssSelector("input[id*='username']")).sendKeys("1801972"); // CSS Regular Expression
		driver.findElement(By.cssSelector("input[id*='password']")).sendKeys("k@mboj123"); // CSS Regular Expression
		driver.findElement(By.cssSelector("span[class*='MuiButton-label']")).click(); // CSS Regular Expression
	}
}
