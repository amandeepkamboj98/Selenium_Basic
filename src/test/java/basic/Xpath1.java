package com.xpaths;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("set up by aman.....");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement input_tool = driver.findElement(By.xpath("(//input[@name='btnI'])[2]"));
		input_tool.sendKeys(Keys.ENTER);
		System.out.println("Aman.......");
	}
}