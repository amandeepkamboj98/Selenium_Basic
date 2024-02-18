package basic_code;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath_Child_Parent {
	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php"); // Page is not working yet
		driver.findElement(By.xpath("//li[text()='Selenium']")).click();

		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click(); 
		// sibling-sibling

		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role")); 
		// child-parent

	}
}
