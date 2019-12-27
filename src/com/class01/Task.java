package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Task {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//TC1
		WebDriver driver1 = new ChromeDriver(); 
		driver1.get("https://www.amazon.com/");
		String actualTitle = driver1.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle ="Amazon.com: Online Shopping for Electronics, Apparel, Computers, "
				+ "Books, DVDs & more";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("You are on the right page");
		}
		else {
			System.err.println("The page you are on is not Amazon.com");
		}
		
		driver1.close();
		
		
		//TC2
		WebDriver driver2 = new ChromeDriver(); 
		driver2.navigate().to("https://www.syntaxtechs.com");
		driver2.navigate().to("https://www.google.com");
		driver2.navigate().back();
		driver2.navigate().refresh();
		String actualURL = driver2.getCurrentUrl();
		System.out.println(actualURL);
		System.out.println("Does the url contain Syntax?\n" + actualURL.contains
				("Syntax".toLowerCase()));
		driver2.close();
		
	}
}
