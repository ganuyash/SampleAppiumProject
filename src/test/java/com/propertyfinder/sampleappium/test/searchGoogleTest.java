package com.propertyfinder.sampleappium.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class searchGoogleTest {
	Property p = new Property();
	public SetupAppium appium = new SetupAppium();

	/**
	 * Initiate & Quit the appium driver
	 */
	@BeforeClass
	public void createDriver() throws Exception {
		appium.setUp();

	}

	@AfterClass
	public void quiteDriver() {
		appium.tearDown();
		
	}

	/**
	 * Application Navigation
	 */
	@Test(priority = 1)
	public void appLogin() {
		appium.searchPage.navigateToResult();
	}
	
}