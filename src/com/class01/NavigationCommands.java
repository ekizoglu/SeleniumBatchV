package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.google.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
		
		//browser navigation commands. 
		
		// Interview question: Difference betweeen .get and navigate()
		//	.navigate() will store history, .get() will not store history; 
		//	with .get() it will wait for the page to load completely before getting to the next page
		// if you want to have user enter some input (like username and password) use .get();
		//navigate to given URL
		driver.navigate().to("http://www.facebook.com");
		
		//navigate back
		driver.navigate().back();
		
		//navigate one step forward
		driver.navigate().forward();
		
		//print title of the page i.e. Home - Some Title
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
	}
}
