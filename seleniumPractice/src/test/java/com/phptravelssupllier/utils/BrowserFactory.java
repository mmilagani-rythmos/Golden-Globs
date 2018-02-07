package com.phptravelssupllier.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	public static WebDriver driver;
	public static WebDriver startBrowser(String browsername,String url){
		if(browsername.equalsIgnoreCase("firefox")){
	    System.setProperty("webdriver.firefox.marionette", "/seleniumPractice/drivers/geckodriver.exe");	
	    driver = new FirefoxDriver();
		 
		}
		else if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "/seleniumPractice/drivers/chromedriver.exe");
         driver= new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.chrome.driver", "/seleniumPractice/drivers/IEDriver.exe");
        driver= new InternetExplorerDriver();
		 
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		}
}