package basic_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Parent_Child_Relationship {
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
    	  driver.get("https://rahulshettyacademy.com/locatorspractice/");
       driver.findElement(By.id("inputUsername")).sendKeys("rahul");
       driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		  driver.findElement(By.id("chkboxTwo")).click(); // -> to click on checkbox 
		  driver.findElement(By.id("chkboxOne")).click(); // -> to click on checkbox 

      driver.findElement(By.className("signInBtn")).click();
      Thread.sleep(5000);

      System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] p")).getText()); 
      // parent child relationshio of Css Selector 
      
      Thread.sleep(5000);
      System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText()); 
      // parent child relationshio of Css Selector 
      
      System.out.println("welcome............");

}
}
