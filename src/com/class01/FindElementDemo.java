package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		//right click --> inspect element --> ctrl+shift+c (select an element in the page to inspect it
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		//DOM (Document object model)
		//IQ: how many locators we have in selenium
		/*
		 * 1-ID
		 * 2-ClassName
		 * 3-TagName
		 * 4-Link Text
		 * 5-Partial Link text
		 * 6-Name
		 * 7-XPATH
		 * 8-CSS
		 */
		
	}
}
