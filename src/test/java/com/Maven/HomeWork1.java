package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomeWork1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ninam\\Desktop\\Documents\\JARfiles\\Drivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
           String url="https://www.google.com/";
           driver.get(url);
           String title  =driver.getTitle();
           
           Assert.assertEquals("Google", title);
          
           
	
		

	}

}
