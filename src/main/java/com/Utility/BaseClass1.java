package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	public static WebDriver driver;
	public static ExcelDataProvider1 excel;
	@BeforeSuite
	public void Bs() throws Exception {
		 excel = new ExcelDataProvider1();
		}
	
	@BeforeMethod
	public void b1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(excel.gm("Sheet1", 0, 2));
		
		driver.manage().window().maximize();
		
		}
	@AfterMethod
	public void browserClosing() {
	//	driver.quit();
	}
	
	
		

}
