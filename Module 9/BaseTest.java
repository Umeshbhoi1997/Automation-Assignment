/*package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AndroidDriver driver;
	AppiumDriverLocalService service;
	@BeforeMethod
	public void test() throws MalformedURLException, InterruptedException {
		
		service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Umesh\\"
				+ "AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("http://127.0.0.1")
				.withTimeout(Duration.ofSeconds(20))
				.usingPort(4723).build();
		service.start().
		
		UiAutomator2Options options=new UiAutomator2Options();
		
		options.setDeviceName("Umesh");
		options.setApp("D:\\Automation Testing\\apk file-20240716T032624Z-001\\apk file\\ApiDemos-debug.apk");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
	// Implicit wait 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.quit();
		
		@AfterMethod
		
	}

}

*/




package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	AndroidDriver driver;
	@Test
	public void test() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options=new UiAutomator2Options();
		
		options.setDeviceName("Umesh");
		options.setApp("D:\\Automation Testing\\apk file-20240716T032624Z-001\\apk file\\ApiDemos-debug.apk");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
	// Implicit wait 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.quit();
		
	}
	

}
