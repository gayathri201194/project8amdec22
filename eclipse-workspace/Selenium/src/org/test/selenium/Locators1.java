package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	
	
	public static void main(String[] args) {
		
		//Browser launch
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathrisri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		//url launch
		
		driver.get("https://www.facebook.com/");
			
		
		//by using id
		
		By id = By.id("email");
			
		WebElement txtUsername = driver.findElement(By.id("email"));
		
		txtUsername.sendKeys("gayathri@gmail.com");
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		
		txtpassword.sendKeys("6egqu");
		
		
		WebElement btnlogin = driver.findElement(By.id("loginbutton"));
		btnlogin.click();
		
		
	
	}
	

	
	
	
	
	

}
