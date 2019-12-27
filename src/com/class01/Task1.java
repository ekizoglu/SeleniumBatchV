package com.class01;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Task1 {
	public static void main(String[] args) {
		/*
		 * 1. Open chrome browser
		 * 2. Navigate to “https://www.zillow.com/”
		 * 3. Navigate to “https://www.google.com/”
		 * 4. Navigate back to Zillow Page
		 * 5. Refresh current page
		 * 6. Verify url contains “Zillow”
		 * 
		*/
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.zillow.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		System.out.println("Does the URL contain Zillow? " + actualURL.contains("Zillow".toLowerCase()));
		driver.close();
		
		
		
	}
}
