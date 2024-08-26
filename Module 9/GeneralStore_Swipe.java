package com.mvn;


/*
 *  Write an Appium Program to connect with emulator wit ecommerce based application using 
Generalstore.app to perform swipe demo to swipe the menu.

 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class GeneralStore_Swipe {

	
	public void opencalci() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "realme RMX3085");
		cap.setCapability("udid","IJWCDA7HUGM7FYHQ");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13.0");
		cap.setCapability( "appPackage","com.androidsample.generalstore");
		cap.setCapability("appActivity","com.androidsample.generalstore.MainActivity");
		cap.setCapability("automationName", "UIAutomator2");
		
		URL url=new URL("http://127.0.0.1:4723/");
		AppiumDriver driver=new AppiumDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Albania\"));")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("amruta");
		Thread.sleep(1000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		Thread.sleep(1000);
		
		
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"/hierarchy/android.widget.FrameLayout/android."
				+ "widget.LinearLayout/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/"
				+ "android.widget.RelativeLayout/android.widget.FrameLayout/android."
				+ "support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/"
				+ "android.widget.LinearLayout/android.widget.ImageView\r\n"
				+ "\"))")).click();

		Thread.sleep(1000);
		
		
		
		
	//	driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
	//	Thread.sleep(2000);
		
	//	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	//	Thread.sleep(2000);
		
		driver.close();
}
}
