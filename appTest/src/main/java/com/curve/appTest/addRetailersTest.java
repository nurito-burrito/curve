package com.curve.appTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.main;
import pageObjects.homeScreen;


public class addRetailersTest extends main {

	@BeforeClass
	public void startTesting() {

		hScreen = new homeScreen(driver);
		
	}
	

	@Test(priority = 1)
	public void openApp() {

		Assert.assertTrue(hScreen.getStartedButton.isDisplayed());
		implicitWait(5);
		
		//hScreen.addCard.click();
		
		//Assert.assertTrue(hScreen.category1.isDisplayed());
	
	
	}

	@AfterClass
	/*public void teardown() {
		driver.close();
		System.out.println("Quitting driver and closing Appium Server");
	**/
	
		public void tearDown() {
		    if (driver != null) {
		        driver.quit();
		        }
	}


}
