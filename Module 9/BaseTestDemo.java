package com.mvn;


/*
 *  Write an Appium Program to connect with emulator and open APIdemo.app application on your emulator
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTestDemo {

	public AndroidDriver driver;
	@BeforeMethod
	public void test() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options=new UiAutomator2Options();
		
		options.setDeviceName("Umesh");
	    options.setApp("D:\\Automation Testing\\apk file-20240716T032624Z-001\\apk file\\ApiDemos-debug.apk");
	//	options.setApp("D:\\Automation Testing\\apk file-20240716T032624Z-001\\apk file\\General-store.apk");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
	// Implicit wait 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		}
	public void longPressAction(WebElement ele)
	{
		
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}
	
	@AfterMethod
	public void aftertest() throws InterruptedException {
	
	Thread.sleep(2000);
	driver.quit();
	}
}
