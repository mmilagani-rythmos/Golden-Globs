package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	private WebDriver driver;

	public WebDriver getDriver() {
		return this.driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void click(By elementName) {
		if (verifyElement(elementName)) {
			driver.findElement(elementName).click();
		}

	}

	public void enterText(By elementName, String inputText) {
		if (verifyElement(elementName)) {
			driver.findElement(elementName).sendKeys(inputText);
		}
	}

	public void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Wait failed");
			e.printStackTrace();
		}
	}

	public boolean verifyElement(By elementName) {
		try {
			driver.findElement(elementName);
			return true;
		} catch (Exception e) {
			System.out.println("Element not found");
			return false;
		}
	}

}
