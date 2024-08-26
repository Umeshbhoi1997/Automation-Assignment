package com.mvn;

/*
 *  Write an Appium Program to connect with Realdevice and open APIdemo.app application on your 
realdevice.
 */

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAccessibilityId;
import io.appium.java_client.AppiumDriver;

public class ApiDemos extends BaseTestDemo{
@Test

	public void opencalci() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "realme RMX3085");
		cap.setCapability("udid","IJWCDA7HUGM7FYHQ");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13.0");
		cap.setCapability( "appPackage","io.appium.android.apis");
		cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");
		cap.setCapability("automationName", "UIAutomator2");
		
		URL url=new URL("http://127.0.0.1:4723/");
		AppiumDriver driver=new AppiumDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"WebView\"]")).click();
		Thread.sleep(2000);
		
		
		driver.close();
		
	
	}
}



