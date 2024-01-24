package com.Mvn;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class GeneralStore_RealDevice {

	
@Test	
public void test() throws InterruptedException, IOException {
DesiredCapabilities cap= new DesiredCapabilities();

cap.setCapability("deviceName", "motorola moto e13");
cap.setCapability("udid","ZD2228TJX2");
cap.setCapability("platformName", "Android");
cap.setCapability("platformVersion", "13.0");
cap.setCapability("appPackage","com.androidsample.generalstore");
cap.setCapability("appActivity","com.androidsample.generalstore.SplashActivity");
cap.setCapability("automationName", "UIAutomator2");	
	
URL url= new URL("http://127.0.0.1:4723/");	
	
AppiumDriver driver= new AppiumDriver(url, cap);

driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

driver.findElement(By.id("com.androidsample.generalstore:id/splashscreen")).click();
Thread.sleep(2000);

driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Adolf Hitler");
Thread.sleep(2000);

driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
Thread.sleep(2000);

driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
Thread.sleep(2000);

driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" + ".scrollIntoView(text(\"Burundi\"));")).click();
Thread.sleep(2000);

driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
Thread.sleep(2000);

driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" + ".scrollIntoView(text(\"Jordan Lift Off\"));"));
Thread.sleep(2000);

driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]")).click();
Thread.sleep(2000);

driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
Thread.sleep(2000);

File f= ((RemoteWebDriver)driver).getScreenshotAs(OutputType.FILE);
Files.copy(f, new File("C:\\Users\\tejas\\Screenshot\\GroceryStore_AdtoCart.png"));
Thread.sleep(2000);


driver.quit();
//

}		
}
