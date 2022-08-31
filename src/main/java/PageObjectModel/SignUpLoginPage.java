package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignUpLoginPage {
public WebDriver driver;
	
	By firstName = By.xpath("//input[@name='UserFirstName']");
	By LastName = By .xpath("//input[@name='UserLastName']");
	By WorkEmail = By.xpath("//input[@name='UserEmail']");
	By jobTitle = By.xpath("//select[@name='UserTitle']");
	By CompanyName= By.xpath("//input[@name='CompanyName']");
	By Employees = By.xpath("//select[@name='CompanyEmployees']");
	By PhoneNo = By.xpath("//input[@name='UserPhone']");
	By CountryName = By.xpath("//select[@name='CompanyCountry']");
	By StateName = By.xpath("//select[@name='CompanyState']");
	By Submit = By.xpath("//button[@type='submit']");
	By Agree = By.xpath("//div[@class='checkbox-ui']");
	
	
	
	public SignUpLoginPage(WebDriver driver2) {
		this.driver= driver2;
	}

	public WebElement  EnterfirstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement EnterLastName ()  {
		return driver.findElement(LastName);
	}
	
	public WebElement  EnterWorkEmail () {
		return driver.findElement(WorkEmail);
	}
	
	public WebElement SelectJobTitle() {
		return driver.findElement(jobTitle);
	}
	
	public WebElement EnterCompanyName() {
		return driver.findElement(CompanyName);
	}
	
	public WebElement SelectEmployees () {
		return driver.findElement(Employees);
	}
	
	public WebElement EnterPhoneNo() {
		return driver.findElement(PhoneNo);
	}
	
	public WebElement SelectCountryName() {
		return driver.findElement(CountryName);
	}
	
	public WebElement SelectStateName()  {
		return driver.findElement(StateName);
	}
	
	public WebElement ClickSubmit()  {
		return driver.findElement(Submit);
	}
	
	public WebElement ClickAgree() {
		return driver.findElement(Agree);
	}
}
