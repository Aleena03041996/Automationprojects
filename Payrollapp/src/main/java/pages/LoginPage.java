package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	
	@FindBy(id="loginform-username")
	WebElement usernametext;
	
	@FindBy(id="loginform-password")
	WebElement passwordtext;
	
	@FindBy(name="login-button")
	WebElement loginbut;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public boolean setenableuser()
	{
		boolean b=usernametext.isEnabled();
		return b;
	}
	
	public void setusername(String username)
	{
		usernametext.sendKeys(username);
	}
	
	
	public boolean setenablepassword()
	{
		boolean b1=passwordtext.isEnabled();
		return b1;
	}
	public void setpassword(String password)
	{
		passwordtext.sendKeys(password);
	}
	
	public void loginclick()
	{
		loginbut.click();
	}

}
