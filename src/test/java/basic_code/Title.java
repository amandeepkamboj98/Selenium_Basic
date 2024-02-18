package basic_code;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Title {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(); // new keyword is used to create a memory of  object in the class
        driver.get("https://www.google.com/");  // -> to hit the url
        driver.manage().window().maximize();  // to manage the size of window when it is open in browser
        System.out.println("set up completed by aman");
        System.out.println(driver.getCurrentUrl());  // -> to print url on the console and to know the url is correct
        System.out.println( driver.getTitle());  // -> to print title of page on console and to know the title is correct
        String getTitle = driver.getTitle();
        // System.out.println(driver.getPageSource()); // ->  to get the view source page
        if(getTitle.equals("Google"))
        {
            System.out.println("title is displayed on the page");
        }
        else {
            System.out.println("title is not displayed on the page");
        }
        driver.findElement(By.linkText("Images")).click(); // to click on the Google Images link
       driver.findElement(By.name("q")).sendKeys("Amandeep Kamboj"); // to write our name in google search box
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

//
//        Thread.sleep(3000);
//        driver.get("http://www.yahoo.com"); // -> to hit the another url
//        System.out.println(driver.getTitle()); // -> to get the another page title name on the console
//        Thread.sleep(5000);
//           driver.navigate().back();
//           driver.navigate().forward();
       // driver.close();  // -> to close the current browser tab
      //  driver.quit(); // -> to close all the browsers which are opened by the selenium script
    }
}
