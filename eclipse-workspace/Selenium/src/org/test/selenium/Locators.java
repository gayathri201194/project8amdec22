package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		//1. Launch browser
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathrisri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	  
	 
	    //2.launch url
	     
	     driver.get("https://www.facebook.com/");
		
	    // By id = By.id("email");
		
		WebElement txtUsername = driver.findElement(By.id("email")); 
	     
		txtUsername.sendKeys("gayathri@gmail.com");
		
		
		WebElement txtPassword=driver.findElement(By.id("pass"));
		txtPassword.sendKeys("gayathri");
	}
	
	
	
	
	
	
}
