package co.shuchi.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import co.shuchi.automation.config.DriverConfig;
import co.shuchi.automation.drivermanager.DriverManager;

public class LaunchBrowserTest {
	
	WebDriver driver = DriverManager.getDriver();
	
	@BeforeSuite
	public void setUp() {
		driver.get(DriverConfig.getProperties("web-url"));
		System.out.println("opening browser");
	}
	
	@Test
	public void checkBrowser() {
		System.out.println("opened");
	}
	
	@AfterSuite
	public void close() {
		driver.close();
	}

}
