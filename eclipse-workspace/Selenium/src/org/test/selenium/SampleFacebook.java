package org.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleFacebook {
	
 public static void main(String[] args) {
	//1. Launch browser
	 
	 
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathrisri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
  
 
    //2.launch url
     
     driver.get("https://www.facebook.com/");
     
     
 //3. getcurrenturl
     
     String CurrentUrl = driver.getCurrentUrl();
     System.out.println(CurrentUrl);
     
     //4.gettitle
     
     String title = driver.getTitle();
     System.out.println(title);
 
 }
	
	
	
}
