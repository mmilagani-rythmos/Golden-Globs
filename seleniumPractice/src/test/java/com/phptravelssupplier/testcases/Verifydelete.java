package com.phptravelssupplier.testcases;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.phptravelssupllier.pages.DeletePage;
import com.phptravelssupllier.utils.BrowserFactory;

public class Verifydelete {
	WebDriver driver;
	
	@BeforeTest
	public void start(){
    driver=BrowserFactory.startBrowser("firefox", "https://www.phptravels.net/supplier");
			
	}
	
	@Test
	public void verifyDelete(){
         DeletePage delete = new DeletePage(driver);
		delete.Logindetails();		
		
	}
	
	
	@AfterTest
	public void shutdown()
	{
		//System.out.println("Before quit method");
		 driver.close();
		 //System.out.println("After quit method");
	}

}
