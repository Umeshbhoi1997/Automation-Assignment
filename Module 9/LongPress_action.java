package com.mvn;

/*
 *  Write an Appium Program to connect with realdevice using APIDemo.app to perform longpress to open to 
side menu.

 */
import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class LongPress_action extends BaseTestDemo {
	@Test

	public void pressaction() throws MalformedURLException, InterruptedException {
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
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		
		longPressAction(e1);
		Thread.sleep(2000);
		String msg=driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']")).getText();
		
		assertEquals(msg, "Sample menu");
		Thread.sleep(2000);
		
		driver.close();
		
	}
		
		
		
}
