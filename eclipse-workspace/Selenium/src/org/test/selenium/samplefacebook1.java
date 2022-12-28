package org.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class samplefacebook1 {
	
	public static void main(String[] args) {
		
		
//		Browser LAUNCH
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathrisri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	//url launch
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	//get currenturl
	
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
	
	//get title
	
	String title = driver.getTitle();
	System.out.println(title);	
	
	//quit
	
	driver.close();
		
	}




}
