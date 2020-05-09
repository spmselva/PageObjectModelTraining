package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class LoginPageObjects
{
	@FindBy(how=How.NAME, using="username")
	public static WebElement userName;

	@FindBy(name="password")
	public static WebElement passWord;

	@FindBy(xpath="//*[@id=\'loginfrm\']/button")
	public static WebElement loginButton;

}
