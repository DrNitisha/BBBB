package comPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom1 {
	@FindBy(how=How.XPATH,using="//input[@class='_2IX_2- VJZDxU']")
	private WebElement username;
	@FindBy(how=How.XPATH,using="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password;
	@FindBy(how=How.XPATH,using="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement login;
	
	public WebElement getUsername() {
		
		
		return username;
	}
	
	public WebElement getPassword() {
		
		return password;
	}
	
	public WebElement getLogin() {
		
		return login;
	}

}
