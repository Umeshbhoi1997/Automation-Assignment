package com.mvn;

/*
 *  Write an Appium Program to connect with realdevice using APIDemo.app to perform scrolling the all 
option.

 */
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ScrollDemo  extends BaseTestDemo{
	
	public void scroll () throws InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())."
				+ "scrollIntoView(text(\"Visibility\"));")).click();
		Thread.sleep(3000);
		
	}
	

}
