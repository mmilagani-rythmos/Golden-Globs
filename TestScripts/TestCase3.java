package com.selenium.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		WebElement ele4 = driver.findElement(By.linkText("Profile"));
		ele4.click();
		System.out.println("Step 5");
		WebElement ele5 = driver.findElement(By.xpath("//*[@name='address1']"));
		ele5.sendKeys("Lifestyle");
		System.out.println("Step 6");
		WebElement ele6 = driver.findElement(By.xpath("//*[@name='address2']"));
		ele6.sendKeys("Begumpet");
		System.out.println("Step 7");
		driver.findElement(By.xpath("//*[@class='iCheck-helper']")).click();
		System.out.println("Step 8");
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		System.out.println("Step 9");
	}

}
