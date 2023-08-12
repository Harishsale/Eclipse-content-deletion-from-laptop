package com.hospiol.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public Properties prop;
	public WebDriver driver;

	public TestBase() {

		 prop = new Properties();

		try {
			FileInputStream file = new FileInputStream(
					"C:\\Users\\Jakkam Sairam\\eclipse-workspace\\com.hospiol\\src\\main\\java\\com\\hospiol\\configprop\\propertiesfile");
			try {
				prop.load(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void intialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if (browsername.equals("edge")) {
			WebDriverManager.edgedriver().setup();
		}
		if (browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		} 
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

	}

}
