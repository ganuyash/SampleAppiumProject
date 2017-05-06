package com.propertyfinder.sampleappium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleSearchPage {
	
	WebDriver driver;
	String logMsg = "User on the Mediashare Login Screen Display";
	
	public GoogleSearchPage(WebDriver driver) {
	this.driver=driver;		
	}

	
	public SearchResultList navigateToResult(){

		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")));	
		
		WebElement resultSet = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]"));
		resultSet.click();
		
		return new SearchResultList(driver);
		
	}


}
