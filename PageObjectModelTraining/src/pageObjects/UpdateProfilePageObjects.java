package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UpdateProfilePageObjects
{
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a")
	public static WebElement myProfile;

	@FindBy(xpath="//*[@id=\'profilefrm\']/div/div/div[5]/div/div/input")
	public static WebElement updatePhone;

	@FindBy(xpath="//*[@id=\'profilefrm\']/div/div/div[3]/div[1]/div/input")
	public static WebElement updateCity;

	@FindBy(xpath="//*[@id=\'profilefrm\']/div/div/div[7]/div/button")
	public static WebElement submitButton;

}