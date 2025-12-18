package com.edctool.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebBase {
	
	private static WebDriver driver;
	
	public void createDriver(String browserName) {
		if(browserName.toLowerCase().contains("chrome")) {
			driver = new ChromeDriver();
		} else if(browserName.toLowerCase().contains("firefox")) {
			driver = new FirefoxDriver();
		} else if(browserName.toLowerCase().contains("edge")) {
			driver = new EdgeDriver();
		} else if(browserName.toLowerCase().contains("safari")) {
			driver = new SafariDriver();
		} else if(browserName.toLowerCase().contains("headless")) {
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
		}
		else {
			System.out.println("Please enter the valid browser name.");
		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public void openWebsite(String url) {
		getDriver().manage().window().maximize();
		getDriver().get(url);
	}
	
	public void closeBrowser() {
		getDriver().quit();
	}

}
