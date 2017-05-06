package com.propertyfinder.sampleappium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultList {


	WebDriver driver;
	String expectedTitle = "Courses";
	String Assignmentname = "Assignment";
	String InstructorName = "instructor_Mike Pace";

	public SearchResultList(WebDriver driver) {
		this.driver = driver;

	}
	
	public boolean isCourseTitleDisplayed()
	  {
		
	   WebDriverWait wait = new WebDriverWait(driver, 50);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")));
	   
	   boolean isCoursetitleDisplayed = false;
	   WebElement courseTitle = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]"));

	   String CoursetitletoString = courseTitle.getText();

	   isCoursetitleDisplayed = CoursetitletoString.contains(expectedTitle);
	   
	   return isCoursetitleDisplayed;
	   
	  }
	
	public boolean isAssignmentDisplayed(){
		 WebDriverWait wait = new WebDriverWait(driver, 50);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[4]")));
		   
		 boolean isAssignmentDisplayed=false;
		 WebElement AssignmentNum =  driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[4]"));
		 String AssignmentNumString =  AssignmentNum.getText();
		 
		 isAssignmentDisplayed = AssignmentNumString.contains(Assignmentname);
		
		return isAssignmentDisplayed;
	}
	
	public boolean isAssignmentCountDisplayed(){
		 WebDriverWait wait = new WebDriverWait(driver, 50);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[5]")));
		   
		 boolean isAssignmentCountDisplayed=false;
		 WebElement AssignmentNum =  driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[5]"));
		 String AssignmentNumString =  AssignmentNum.getText();
		 
		 int s = Integer.parseInt(AssignmentNumString);
		 
		 if(s==(int)s){
			 isAssignmentCountDisplayed = true;
		 }else{
			 isAssignmentCountDisplayed = false;
		 } 
		
		return isAssignmentCountDisplayed;
	}
	
	public boolean isInstructorDisplayed(){
		 WebDriverWait wait = new WebDriverWait(driver, 50);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[2]")));
		   
		 boolean isInstructorNameDisplayed=false;
		 WebElement InstructorName =  driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[2]"));
		 String InstructorNameString =  InstructorName.getText();
		 
		 isInstructorNameDisplayed = InstructorNameString.contains(InstructorNameString);
		
		return isInstructorNameDisplayed;
	}
	


}
