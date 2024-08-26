package com.mvn;

/*Write an Appium Program to connect with realdevice using APIDemo.app to open the calculator and 
calculate all the operation like (addition, substraction, multiplication, division).
*/
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.asymmetric.DSA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class CalciDemo {
	@Test
	public void opencalci() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "realme RMX3085");
		cap.setCapability("udid","IJWCDA7HUGM7FYHQ");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13.0");
		cap.setCapability( "appPackage","com.coloros.calculator");
		cap.setCapability("appActivity","com.android.calculator2.Calculator");
		cap.setCapability("automationName", "UIAutomator2");
		
		URL url=new URL("http://127.0.0.1:4723/");
		AppiumDriver driver=new AppiumDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.coloros.calculator:id/digit_1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.coloros.calculator:id/img_op_add")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.coloros.calculator:id/digit_2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.coloros.calculator:id/img_eq")).click();
		Thread.sleep(1000);
		// driver.findElement(By.id("com.coloros.calculator:id/result"));
		String a1=driver.findElement(By.id("com.coloros.calculator:id/result")).getText();
       System.out.println(a1);
	}

}
