package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	private static Properties properties;

	static {
		try {
			File file = new File("C:\\Users\\Lketireddy\\Documents\\workspace-sts-3.9.1.RELEASE\\training\\src\\resources\\selenium.properties");
			FileInputStream fileInput = new FileInputStream(file);
			properties = new Properties();
			properties.load(fileInput);
			fileInput.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getChromePath() {
		String key = "chromedriver";
		String value = properties.getProperty(key);
		return value;
	}

	public static String getFirefoxPath() {
		String key = "firefoxdriver";
		String value = properties.getProperty(key);
		return value;
	}
}