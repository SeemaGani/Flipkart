package com.Flipkart.testscripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.Flipkart.generics.BaseClass;

public class Demo extends BaseClass {

	@Test
	public void testGrid() throws MalformedURLException, InterruptedException {
		
		URL nodeurl= new URL("http://192.168.43.125:5555/wd/hub");
		DesiredCapabilities ds= new DesiredCapabilities();
		ds.setPlatform(Platform.WINDOWS);
		ds.setBrowserName("chrome");
		RemoteWebDriver d= new RemoteWebDriver(nodeurl, ds);
		
	}
}
