package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork1 {

	@Test
	public  void main() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ninam\\eclipse-workspace\\com.Maven\\Drivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
           String url="https://www.google.com/";
           driver.get(url);
           String title  =driver.getTitle();
           
           Assert.assertEquals("Google", title);
           
           driver.quit();
          
           
	
		

	}

}
