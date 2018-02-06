package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1Negative {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		String baseurl = "https://www.phptravels.net/supplier";
		driver.get(baseurl);
		driver.manage().window().maximize();
		WebElement ele1 = driver.findElement(By.xpath("//input[@class='form-control'][1]"));
		ele1.sendKeys("supplier@phptravels.com");
		System.out.println("Step 1");
		WebElement ele2 = driver.findElement(By.xpath("//input[@class='form-control'][2]"));
		ele2.sendKeys("demo");
		System.out.println("Step 2");
		driver.findElement(By.xpath("//*[@class='iCheck-helper']")).click();
		System.out.println("Step 3");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		System.out.println("Step 4");
		System.out.println("Error message displayed");
	}

}
