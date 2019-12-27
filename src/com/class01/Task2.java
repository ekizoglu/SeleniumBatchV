package com.class01;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Task2 {
	public static void main(String[] args) {
		/*
		1. Open chrome browser
		2. Navigate to Facebook
		3. Validate that the expected Facebook title matches the
		actual Facebook title “Facebook - Log in or Sign up”
		4. Click on Forgot account Links
		5. Validate that the expected Facebook title matches the
		actual Facebook title “Forgot Password | Can't Log In |
		Facebook”
		6. Navigate Back
		7. Refresh the page
		8. Validate that the expected Facebook title matches the
		actual Facebook title “Facebook - Log in or Sign up”
		9. Close the Browser
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://www.facebook.com");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Facebook - Log In or Sign Up";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Actual and expected title match");
		}
		else {
			System.err.println("Actual and expected Not Matched");
		}
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		
		driver.close();
		
	}
}
