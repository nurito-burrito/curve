package core;

import java.io.File;

import io.appium.java_client.service.local.AppiumServiceBuilder;

public class launchAppium {

	private static AppiumServiceBuilder service;

	public static void startAppium() {
		System.out.println("Trying to start Appium!");
		service = new AppiumServiceBuilder().usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
				.withAppiumJS(new File("C:\\Users\\Nurseda\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\build\\lib\\main.js"));
		service.build().start();
		System.out.print("Appium Server Started");
	}

	public static void stopAppium() {
		System.out.println("Appium Server Stopping");
		try {
			service.build().stop();
		} catch (Exception e) {
			System.out.println("Appium Server is stopped already!");
		}
		System.out.println("Appium server shut down!");
	}

}