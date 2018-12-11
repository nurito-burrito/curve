package core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pageObjects.homeScreen;
import core.launchAppium;

public class main {

	public homeScreen hScreen;
	public AndroidDriver<MobileElement> driver;

	public void getCapabilities() throws MalformedURLException {

		DesiredCapabilities d = new DesiredCapabilities();
		//d.setCapability("deviceName", "OnePlus ONEPLUS A5010");
		d.setCapability("deviceName", "Pixel 2 XL");
		d.setCapability("udid", "emulator-5554");
		//d.setCapability("udid", "e6dc0a11");
		d.setCapability("platformName", "Android");
		d.setCapability("platformVersion", "9.0");
		d.setCapability("appPackage", "com.imaginecurve.curve.dev");
		d.setCapability("appActivity", "com.imaginecurve.curve.startup.launch.LaunchActivity");
		// d.setCapability("appActivity", "com.imaginecurve.curve.main.MainActivity");
		d.setCapability("browserName", "");
		d.setCapability("app", "C:\\Users\\Nurseda\\Desktop\\android-app.apk");
		d.setCapability("noReset", true);

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), d);

		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}

	}

	@BeforeSuite
	public void startAppiumServer() throws InterruptedException {
		// launchAppium.stopAppium();
		launchAppium.startAppium();
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);

	}

	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "up");
		js.executeScript("mobile: scroll", scrollObject);

	}

	public void implicitWait(int sec) {
		try {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@AfterSuite
	public void stopAppium() throws InterruptedException {
		launchAppium.stopAppium();

	}
}
