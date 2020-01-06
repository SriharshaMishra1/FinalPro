package com.crm.Vtiger.Final;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\sriharsha\\eclipse-(cucumber)\\VTiger\\src\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");*/
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
	}
}
