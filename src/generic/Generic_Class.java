package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pom.Home_Page;
import pom.Login_Page;

public class Generic_Class implements Project_Constants  {
	
	public WebDriver driver;
	
	static
	{
		System.setProperty(gecko_key, gecko_value);
		
	}
	
	@BeforeClass
	public void launch_App()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
//	@BeforeMethod
//	public void loginApp()
//	{
//		Login_Page lp= new Login_Page(driver);
//
//		
//		lp.verifyTitle("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
//		
//		System.out.println(driver.getTitle());
//	
//
//		lp.emailid("7030071199");
//		
//		lp.pswd("9972827211");
//		
//		
//		lp.loginButton();
//		lp.verifyTitle("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
//		//System.out.println(driver.getTitle());
//
//	}
	
//	@AfterMethod
//	public void logoutApp()
//	{
//		Home_Page hp=new Home_Page(driver);
//		hp.myaccount(driver);
//		hp.signOut();
//		hp.verifyTitle("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
//		//System.out.println(driver.getTitle());
//	}
	
	
	
	@AfterClass
	public void close_App()
	{
		//driver.quit();
	}
	

}
