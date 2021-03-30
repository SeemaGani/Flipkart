package com.Flipkart.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy (xpath="//a[.='Login']") private WebElement login_button;
	@FindBy(xpath="(//div[@class='exehdJ'])[1]") private WebElement move_username;
	@FindBy(xpath="//div[.='Logout']") private WebElement logout;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnLogin() {
		
		login_button.click();
		
	}
    public void toLogout(WebDriver driver) throws InterruptedException
    {
    	Actions act=new Actions(driver);
    	act.moveToElement(move_username).perform();
    	Thread.sleep(2000);
    	logout.click();
    }
}
