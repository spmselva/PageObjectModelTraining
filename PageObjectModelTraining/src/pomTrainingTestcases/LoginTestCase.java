package pomTrainingTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.LoginPageObjects;

public class LoginTestCase
{
	@Test
	public void loginFunctionality() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELVA\\SELENIUM\\Downloads\\chromedriver-new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/login");
		Thread.sleep(4000);

		PageFactory.initElements(driver, LoginPageObjects.class);

		LoginPageObjects.userName.sendKeys("user@phptravels.com");
		LoginPageObjects.passWord.sendKeys("demouser");
		LoginPageObjects.loginButton.click();
	}

}