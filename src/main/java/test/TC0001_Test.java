package test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.LogInPage;
import webdriver.WebdriverFactory;

public class TC0001_Test {
	LogInPage loginPage;
	@BeforeMethod
	public void start() {
		WebdriverFactory driverFactory = new WebdriverFactory();
		loginPage = new LogInPage(driverFactory.getDriver("chrome", "https://www.phptravels.net/supplier"));
	}
	
	
	@Test
	public void VerifyloginFunc() {
		assertTrue(loginPage.loginApplication("supplier@phptravels.com", "demosupplier"));
		
	}
	@Test
	public void VerifyloginFuncNeg() {
		assertFalse(loginPage.loginApplication("supplier@phptravels.com", "demofghsupplier"));
	}
	
	@AfterMethod
	public void shutdown() {
		loginPage.getDriver().quit();
	}
		

}
