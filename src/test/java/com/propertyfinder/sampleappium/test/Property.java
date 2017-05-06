package com.propertyfinder.sampleappium.test;

import java.util.Properties;

import org.openqa.selenium.ScreenOrientation;


public class Property{
	
		//Properties files to use//
		String pfileNameEnv = "env.properties";
		String pfileLocatorEnv = "locator.properties";
				
		Properties envProperty = new LoadPropertyFile().getPropValues(pfileNameEnv);
		Properties pageobjProperty =  new LoadPropertyFile().getPropValues(pfileLocatorEnv);

	
		//Environment Properties
		String appium_version = envProperty.getProperty("appium_version");
		String platformName = envProperty.getProperty("platformName");
		public String platformVersion = envProperty.getProperty("platformVersion");
		public String deviceName = envProperty.getProperty("deviceName");
		String appPath = envProperty.getProperty("appPath");
		String url = envProperty.getProperty("url");
		String bundleid = envProperty.getProperty("bundleid");
		String udid = envProperty.getProperty("udid");
		
	
		

}
