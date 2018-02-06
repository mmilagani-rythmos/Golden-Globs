package com.selenium.project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "D:\\Selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/supplier");
		Thread.sleep(3000);
        Set<String> mainpage = driver.getWindowHandles();        
        for(String curWindow : mainpage){
            driver.switchTo().window(curWindow);
        }
        driver.findElement(By.xpath("//input[@type='text'][@name='email']")).sendKeys("supplier@phptravels.com");
        driver.findElement(By.xpath("//input[@type='password'][@name='password']")).sendKeys("demosupplier");
        driver.findElement(By.xpath("//div[@class='icheckbox_square-grey']/ins")).click(); 
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[12]/span/a[3]/i")).click();
        driver.switchTo().alert().accept();
        
}

	}


