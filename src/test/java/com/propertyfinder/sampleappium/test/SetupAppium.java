package com.propertyfinder.sampleappium.test;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.propertyfinder.sampleappium.pageobjects.GoogleSearchPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;


public class SetupAppium {
	
	  IOSDriver<MobileElement> driver;
	  String logMsg = "Appium Server Inititaed";
	  Property p = new Property();
	  public GoogleSearchPage searchPage;
	  
	 
	  
	  public void setUp() throws MalformedURLException {
		  	 
		  	 DesiredCapabilities capabilities = new DesiredCapabilities();
	         
		  	 capabilities.setCapability("app",p.appPath);		  	 
	         capabilities.setCapability("platformName", p.platformName);
	         capabilities.setCapability("platformVersion", p.platformVersion);
	         capabilities.setCapability("deviceName", p.deviceName);
	         capabilities.setCapability("udid", p.udid);
	       
	    	
	         driver = new IOSDriver<MobileElement>(new URL(p.url), capabilities); 
	         
	         searchPage = new GoogleSearchPage(driver);
	        
	  }
	 

	  public void tearDown(){
		  driver.quit();
		  
		  
	  }
 
}
