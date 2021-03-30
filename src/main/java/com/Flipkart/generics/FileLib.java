package com.Flipkart.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileLib {
 
	public String getValues(String key) throws IOException
	{
		FileInputStream fn=new FileInputStream("./src/test/resources/Data/Logindetails.properties");
		Properties p=new Properties();
		p.load(fn);
		String value=p.getProperty(key);
		return value;
		
		
	}
	
	
	
	
}
