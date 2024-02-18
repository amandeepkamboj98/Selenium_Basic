package basic_code;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Email {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--remote-allow-origins=*");
//		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.ptuexam.com/login"); // -> to hit the url
		driver.manage().window().maximize();
		System.out.println("set up completed by aman");

		driver.findElement(By.id("username")).sendKeys("1801972");
		driver.findElement(By.id("password")).sendKeys("k@mboj123");
		driver.findElement(By.xpath("/html/body/div/main/div[2]/div/form/button/span[1]")).click();
		// classname locator is used when there is no any sapce between the value of classname locator
																								
	}
}