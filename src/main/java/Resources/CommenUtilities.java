package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommenUtilities {

	
	public static void DropdownHandle(WebElement dropdownxpath,int dropdownvalue)  {
	
		// this is a common method to handle dropdown
		
		Select s = new Select(dropdownxpath);
	    s.selectByIndex(dropdownvalue);
	}
	
	public static void handleassertion(String actual,String expected)  {
		
		 SoftAssert assertion = new SoftAssert();
		   assertion.assertEquals(actual,expected);
		  
		   assertion.assertAll();
	}
}
