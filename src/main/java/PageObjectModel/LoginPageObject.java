package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	public WebDriver driver;
	// we have achieve encapsulation here
	// this driver doesnt have scope so we create constructor of verifylogintest class 
	
	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By loginButton = By.xpath("//input[@id='Login']");
	private By TryForFree= By.xpath("//a[@id='signup_link']");

	
	// this constructor gives scope to driver of login page object 
	public LoginPageObject(WebDriver driver2) {
		this.driver= driver2;
	}

	public  WebElement EnterUsername()  {
		return driver.findElement(username);
	}
	
	public WebElement EnterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement ClickLogin()  {
		 return driver.findElement(loginButton);
	}

	public WebElement TryForFree()  {
		
		return driver.findElement(TryForFree);
	}
}
