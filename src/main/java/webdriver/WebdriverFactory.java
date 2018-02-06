package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import properties.ReadPropertiesFile;

public class WebdriverFactory {
	private WebDriver driver;
	private String chromepath = ReadPropertiesFile.getChromePath();
	private String firefoxpath = ReadPropertiesFile.getFirefoxPath();

	public WebDriver getDriver(String browser, String url) {

		switch (browser) {
		case "chrome":
			startChromeDriver(url);
			break;
		case "firefox":
			startFireFoxDriver(url);
			break;
		}
		return driver;
	}

	public void startChromeDriver(String url) {
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void startFireFoxDriver(String url) {
		System.setProperty("webdriver.firefox.marionette", firefoxpath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

}
