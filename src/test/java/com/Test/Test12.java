package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Utility.BaseClass1;
import com.Utility.Library1;

import comPages.LoginPom1;

public class Test12 extends BaseClass1 {
	
	
	
	@Test
	public void loginPage() {
		LoginPom1 login=PageFactory.initElements(driver,LoginPom1.class );
		Library1.customsendkeys(login.getUsername(),excel.gm("Sheet1", 0, 0));
		Library1.customsendkeys(login.getPassword(), excel.gm("Sheet1", 0, 1));
		Library1.customclick(login.getLogin());

}
}