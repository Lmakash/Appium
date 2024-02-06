package Day1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TCoo2_Calculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "12");
		dc.setCapability("deviceName", "Pixel 4 API 31");
		dc.setCapability("udid", "emulator-5554");
		dc.setCapability("appPackage", "com.google.android.calculator");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		dc.setCapability("app","‪‪C:\\appium1\\example.apk");
		 URL url=new URL("http://127.0.0.1:4723/wd/hub");
		 AndroidDriver driver=new AndroidDriver(url,dc);
 		
			Thread.sleep(2000);
			driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
			Thread.sleep(2000);
driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
Thread.sleep(2000);		
	}

}
