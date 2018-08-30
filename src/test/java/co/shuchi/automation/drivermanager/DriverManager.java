package co.shuchi.automation.drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import co.shuchi.automation.config.DriverConfig;

public class DriverManager {
	
	private static WebDriver driver;
	
	protected DriverManager() {
		
		System.setProperty("webdriver.chrome.driver", DriverConfig.getProperties("chrome-driver"));
		if(DriverConfig.getProperties("browser-type").equals("chrome")){
			driver = new ChromeDriver();
		}else if(DriverConfig.getProperties("browser-type").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new ChromeDriver();
		}
	}
	
	public static WebDriver getDriver() {
		if(driver == null) {
			new DriverManager();
		}
		return driver;
	}

}
