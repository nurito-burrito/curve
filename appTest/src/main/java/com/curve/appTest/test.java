package com.curve.appTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import pageObjects.homeScreen;

public class test {

	public homeScreen hScreen;
	private AndroidDriver<MobileElement> driver;
	
	
	@BeforeClass
	public void setUp() throws MalformedURLException {

		DesiredCapabilities d = new DesiredCapabilities();
		/*
		//d.setCapability("deviceName", "OnePlus ONEPLUS A5010");
		//d.setCapability("automationName", "uiautomator2");
		d.setCapability("deviceName", "Pixel 2 XL");
		d.setCapability("udid", "emulator-5554");
		//d.setCapability("udid", "e6dc0a11");
		d.setCapability("platformName", "Android");
		d.setCapability("platformVersion", "9.0");
		d.setCapability("appPackage", "com.imaginecurve.curve.dev");
		d.setCapability("appActivity", "com.imaginecurve.curve.startup.carousel.CarouselActivity");
		d.setCapability("locale", "en_US");
		d.setCapability("language", "en");
		d.setCapability("browserName", "");
		d.setCapability("app", "C:\\Users\\Nurseda\\Desktop\\android-app.apk");
		d.setCapability("noReset", true);
		**/
		
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		d.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus ONEPLUS A5010L");
		d.setCapability(MobileCapabilityType.UDID, "e6dc0a11");
		d.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		d.setCapability(MobileCapabilityType.LANGUAGE, "en");
		d.setCapability(MobileCapabilityType.LOCALE, "en_US");
		d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.imaginecurve.curve.dev");
		d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.imaginecurve.curve.startup.carousel.CarouselActivity");
		d.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		d.setCapability(MobileCapabilityType.APP, "C:\\Users\\Nurseda\\Desktop\\android-app.apk");
		d.setCapability(MobileCapabilityType.NO_RESET, true);
		
		//driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:" + "4723" + "/wd/hub"), d);
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), d);
		
		
		/*
		try {
			
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), d);
			
		}catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		**/
	}

	/*
	
	@BeforeTest
	public void startTesting() {

		hScreen = new homeScreen(driver);
		
	}
	
**/
	@Test(priority = 1)
	public void addCard() throws InterruptedException {
		
		//hScreen.addCard.click();
		
		Assert.assertTrue(hScreen.getStartedButton.isDisplayed());
		
		Thread.sleep(8000);
	
	
	}
	
	@AfterClass
	public void teardown() {
		System.out.println("Quitting driver");
		driver.quit();
	}

}