package com.selenium.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class TestCase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseurl = "https://www.phptravels.net/supplier";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseurl);
		driver.manage().window().maximize();
		WebElement ele1 = driver.findElement(By.xpath("//input[@class='form-control'][1]"));
		ele1.sendKeys("supplier@phptravels.com");
		System.out.println("Step 1");
		WebElement ele2 = driver.findElement(By.xpath("//input[@class='form-control'][2]"));
		ele2.sendKeys("demosupplier");
		System.out.println("Step 2");
		driver.findElement(By.xpath("//*[@class='iCheck-helper']")).click();
		System.out.println("Step 3");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		System.out.println("Step 4");
		//
		Actions act = new Actions(driver);
		WebElement ele3 = driver.findElement(By.xpath("//*[text()='Tours'][1]"));
		System.out.println("Step 5");
		act.moveToElement(ele3).build().perform();
		System.out.println("Step 6");
		driver.findElement(By.linkText("Manage Tours")).click();
		System.out.println("Step 7");

	}

}
