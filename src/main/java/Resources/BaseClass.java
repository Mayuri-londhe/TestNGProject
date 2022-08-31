package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver browserlaunch() throws IOException {
	
		// this will help us to read data properties
    FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");
    
    // this will help us to acess code 
             prop = new Properties();
    
    prop.load(fis);
    
   String browserName  = prop.getProperty("browser");
   
   
   if(browserName.equalsIgnoreCase("chrome")) {
	   
	        WebDriverManager.chromedriver().setup();  // this will run with latest chrome browser of your system
	      // WebDriverMAnager.chromDriver.version("102.1.0").setup() // This will run with 
	   
	          driver = new ChromeDriver();
	   
   }

   else if (browserName.equalsIgnoreCase("firefox")) {
	   
	   // firefox code
   }
   
   else if (browserName.equalsIgnoreCase("edge")) {
	   
	   // edge code
   }
   
   else {
	   System.out.println(" please select valid browser");
	   
   }
    
        return driver;
    
	}
	
	@BeforeMethod
	public void launchbrowser() throws IOException {
		
		browserlaunch();
		driver.get(prop.getProperty("url"));
	}
	
/*	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}  */
	
	


	
}