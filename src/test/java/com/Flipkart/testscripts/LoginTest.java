package com.Flipkart.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Flipkart.generics.BaseClass;
@Listeners(com.Flipkart.generics.ListnerImplementation.class)
public class LoginTest extends BaseClass {
	@Test
	public void Login() throws IOException, InterruptedException
	{
//		Thread.sleep(2000);
//		Assert.assertEquals(driver.getTitle(), f.getValues("PageTitle"));
		
	}
	
	
	}
