package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001 {
	
	WebDriver driver;
	
	
	
	@Test(priority=1)
	public void openFB() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		System.out.println("Test was successful");

	}
	
	@Test(priority=2)
	public void openGit() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://github.com/");
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
