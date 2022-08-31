package TestNGFramework.demo1;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignUpLoginPage;
import Resources.BaseClass;
import Resources.CommenUtilities;
import Resources.TestCaseData;
import dev.failsafe.internal.util.Assert;

public class VerifySignUpTestCases extends BaseClass {

	private static final String Softassert = null;

	@Test
	public void SignUp() throws IOException, InterruptedException {
		
		
	    
		LoginPageObject lpo = new LoginPageObject(driver);
		
		Thread.sleep(5000);
		
		lpo.TryForFree().click();
		
		
		Thread.sleep(5000);
		
		SignUpLoginPage slp = new SignUpLoginPage(driver);
			
		String actualTitle = driver.getTitle();
		String expectedTitle= TestCaseData.ExpectedTitle;
		
		CommenUtilities.handleassertion(actualTitle, expectedTitle);
		
		System.out.println(driver.getTitle());
		
		slp.EnterfirstName().sendKeys(TestCaseData.FirstName);
		slp.EnterLastName().sendKeys(TestCaseData.LastName);
		slp.EnterWorkEmail().sendKeys(TestCaseData.WorkEmail);
	    slp.EnterCompanyName().sendKeys(TestCaseData.CompanyName);
	    slp.EnterPhoneNo().sendKeys(TestCaseData.PhoneNo);
	    slp.ClickAgree().click();
	   
	   
	    CommenUtilities.DropdownHandle(slp.SelectJobTitle(),2);
	    CommenUtilities.DropdownHandle(slp.SelectCountryName(),2);
	    CommenUtilities.DropdownHandle(slp.SelectEmployees(),2);
	   
	  
	   
		
	    slp.ClickSubmit().click();
	    
	    
	   
	    
	    
	}
}
