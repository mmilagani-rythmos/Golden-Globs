package com.selenium.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase4Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String baseurl = "https://www.phptravels.net/supplier";
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
		driver.findElement(By.xpath("//*[@class='btn btn-danger btn-block']")).click();
		System.out.println("Step 5");
		Select dpdn = new Select(driver.findElement(By.xpath("//*[@id='apply']")));
		dpdn.selectByIndex(0);
		System.out.println("Step 6");
		Select dpdn1 = new Select(driver.findElement(By.name("service")));
		dpdn1.selectByVisibleText("Tours");
		System.out.println("Step 7");
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		System.out.println("Step 8");
	}

	}


