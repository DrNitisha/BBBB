package com.Utility;

import org.openqa.selenium.WebElement;

public class Library1 {
	public static void  customsendkeys(WebElement element ,String value) {
		element.sendKeys(value);
		
		}
	public static void customclick(WebElement element) {
		element.click();
	}
	

}
