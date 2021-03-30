package com.Flipkart.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']") private WebElement username;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']") private WebElement password;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']") private WebElement login_button;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
public void enterUsername(String un)
{
	username.sendKeys(un);
}
	
public void enterPassword(String pwd)
{
	password.sendKeys(pwd);
}
	
public void clickLogin()
{
	login_button.click();;
}
	
}
