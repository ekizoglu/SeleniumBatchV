package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	
		driver.get("https://www.google.com");
		
		final String expectedTitle = "Google"; 
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("The actual and expected titles matched");
		}
		else {
			System.err.println("The actual and expected titles didn't match");
		}
		
		System.out.println("*******************************************");
		//stimes url input and actual url does not match (i.e. google.com/$123245) you need to use 
		// this method to make sure you are on the right page
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		String expectedURL = "https://www.google.com/"; 
		
		if (expectedURL.equals(actualURL)) {
			System.out.println("Both URLs match");
		}
		else {
			System.err.println("Actual and expected Not Matched");
		}
		driver.close();
		
	}
}
