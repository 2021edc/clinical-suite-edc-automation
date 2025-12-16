package com.edctool.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAmazonSearch {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); // it will open the Chrome browser
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("button[alt='Continue shopping']")).click();
		
		WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
		element.click();
		element.sendKeys("iPhone 16");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
