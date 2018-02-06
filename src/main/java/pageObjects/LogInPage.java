package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage {

	public LogInPage(WebDriver driver) {
		setDriver(driver);
	}

	// private static WebElement element;
	private By username = By.xpath("//input[@class='form-control'][1]");
	private By password = By.xpath("//input[@class='form-control'][2]");
	private By login = By.xpath("//*[@type='submit']");
	private By logOut = By.linkText("Log Out");

	public boolean loginApplication(String userName, String password) {
			wait(3);
			enterText(this.username, userName);
			enterText(this.password, password);
			click(login);
			wait(3);
			if (verifyElement(logOut)) {
				System.out.println("Login Successful");
				return true;
			} else {
				System.out.println("Login Unsuccessful");
				return false;
			}
		
	}
}
