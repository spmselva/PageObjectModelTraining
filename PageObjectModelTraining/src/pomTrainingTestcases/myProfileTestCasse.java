package pomTrainingTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.UpdateProfilePageObjects;

public class myProfileTestCasse
{
	@Test
	public void myProfileFunctionality() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELVA\\SELENIUM\\Downloads\\chromedriver-new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/login");
		Thread.sleep(4000);

		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.userName.sendKeys("user@phptravels.com");
		LoginPageObjects.passWord.sendKeys("demouser");
		LoginPageObjects.loginButton.click();
		Thread.sleep(4000);
		
		PageFactory.initElements(driver, UpdateProfilePageObjects.class);
		
		UpdateProfilePageObjects.myProfile.click();
		UpdateProfilePageObjects.updatePhone.sendKeys("9876543210");
		UpdateProfilePageObjects.updateCity.sendKeys("Chennai");
		UpdateProfilePageObjects.submitButton.click();
	}

}