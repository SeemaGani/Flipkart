package com.Flipkart.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Flipkart.objectrepository.HomePage;
import com.Flipkart.objectrepository.LoginPage;


public class BaseClass extends WebDriverCommonLib{
	public static WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/Drivers/geckodriver.exe");

	}
	public FileLib f=new FileLib();
	public WebDriverCommonLib w= new WebDriverCommonLib();

	
	@BeforeTest
	public void openBrowser() throws IOException
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(f.getValues("URL"));
	w.waitForElementGui(driver);
	
	}
	@BeforeMethod
	public void loginFlipkart() throws IOException, InterruptedException
	{
		
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(f.getValues("UserName"));
		lp.enterPassword(f.getValues("Password"));
		lp.clickLogin();
		Thread.sleep(2000);
	}
   @AfterMethod
   public void logout() throws InterruptedException
   {
	   
	 HomePage hp = new HomePage(driver); 
	 hp.toLogout(driver);
	 Thread.sleep(2000);
   }
   @AfterTest
   public void closeBrowser() throws InterruptedException {
	   Thread.sleep(2000);
	  driver.close(); 
   }
   
}
