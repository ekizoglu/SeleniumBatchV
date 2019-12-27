package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChromeBrowser {
	public static void main(String[] args){
		//For windows you have to specify driver extension --> .exe
		// system is a class .setPrperty() is a static method
		// .setProperty(key,value);
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//http--> hypertext transfer protocol, .get("https://google.com") will also work
		driver.get("https://www.google.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
		
		//browser navigation commands. 
		
		//navigate to given URL
		driver.navigate().to("http://www.facebook.com");
		
		//navigate back
		driver.navigate().back();
		
		//navigate one step forward
		driver.navigate().forward();
		
		//print title of the page i.e. Home - Some Title
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		//to close the page
//		driver.close();
	}
}
