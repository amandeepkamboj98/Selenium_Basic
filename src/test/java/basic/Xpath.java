package com.xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("set up by aman.....");
		
		//  -> //tagname[@attribute='attribute_value']
		WebElement search = driver.findElement(By.xpath("//*[@class='gLFyf']"));
		search.sendKeys("Selenium WebDriver");
		search.sendKeys(Keys.ENTER);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
}
