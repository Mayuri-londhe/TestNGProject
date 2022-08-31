package TestNGFramework.demo1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.CommenUtilities;
import Resources.TestCaseData;


public class VerifiLoginTestCases extends BaseClass {
		// we have achieve inheritance here 
	
	@Test
	public void login() throws IOException {
		
		
		
		
		 LoginPageObject lpo = new LoginPageObject(driver);
		 
		 lpo.EnterUsername().sendKeys(TestCaseData.userName);
		 lpo.EnterPassword().sendKeys(TestCaseData.Password);
		 lpo.ClickLogin().click();
		 
		
		 String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		 String actual   = driver.findElement(By.xpath("//div[@id='error']")).getText();
		 
		   
		 CommenUtilities.handleassertion(actual, expected);
		 
		   
		   
		 }
		 
	}
	
	

