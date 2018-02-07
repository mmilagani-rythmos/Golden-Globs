package com.phptravelssupllier.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeletePage {
	
	WebDriver driver;
	
	By username=By.xpath("//input[@type='text'][@name='email']");
	By passwrd=By.xpath("//input[@type='password'][@name='password']");
	By checkbox=By.xpath("//div[@class='icheckbox_square-grey']/ins");
	By sign_in=By.xpath("//button[@type='submit']");
	By delete= By.xpath("(//a[@title='DELETE'])[1]");
    
	
	public DeletePage(WebDriver driver){
		this.driver = driver;	
      }
	
	public void Logindetails(){
	driver.findElement(username).sendKeys("supplier@phptravels.com");
	driver.findElement(passwrd).sendKeys("demosupplier");
	driver.findElement(checkbox).click();
	driver.findElement(sign_in).click();
	try {
		Thread.sleep(6000);
		driver.findElement(delete).click();
		driver.switchTo().alert().accept();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		//System.out.println("method completed");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
}