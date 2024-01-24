package com.Mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ApiDemosMainFile extends ApiDemosBaseFile {
@Test
	public void longpress() throws InterruptedException {
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" + ".scrollIntoView(text(\"Views\"));")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
		Thread.sleep(2000);
		
		WebElement e1= driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPressAction(e1);
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
	
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Gallery\"]")).click();
		Thread.sleep(2000);
	
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		Thread.sleep(2000);

		for (int i = 1; i <2; i++) {
		WebElement ele= driver.findElement(By.xpath("//android.widget.ImageView["+i+"]"));	//dynamic xpath banavla ek image vr click karun
		Thread.sleep(2000);
		swipeAction(ele, "left");
		Thread.sleep(2000);

		
		
		driver.quit();
}
}
}
