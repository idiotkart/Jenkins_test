package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001 {
	
	@Test
	public void openFB() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		System.out.println("Test was successful");

	}
}
