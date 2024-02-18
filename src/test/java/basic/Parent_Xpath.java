package com.xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parent_Xpath {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.tatacliq.com/");
	driver.manage().window().maximize();
	System.out.println("set up by aman.....");
	
	// Location popup
	//			driver.findElement(By.id("wzrk-cancel")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='root']/child::div/div/div/div/div/div/a[4]")).click();
	}
}
