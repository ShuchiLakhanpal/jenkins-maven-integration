package co.shuchi.automation.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class DriverConfig {
	
	private static Properties properties;
	
	private DriverConfig() {
		try {
			Path path = Paths.get("src", "test", "resources", "config","configfile.properties");
			InputStream in = new FileInputStream(path.toFile());
			properties = new Properties();
			properties.load(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static String getProperties(String key) {
		if(properties == null) {
			new DriverConfig();
			if(properties.getProperty(key)== null) {
				System.out.println("please ensure correct file path is provided");
			}
		}
		return properties.getProperty(key);
	}
}
