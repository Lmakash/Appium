package Day2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class bitbar_test {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:deviceName", "Medium Phone API 32");
		dc.setCapability("appium:skipServerInstallation","true");
		dc.setCapability("appium:noReset", "true");
		dc.setCapability("appium:platformVersion","12.0");
		dc.setCapability("appium:app","‪C:\\appium1\\bitbar-sample-app.apk");	
		
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");  // you have to go on appium server;
		AndroidDriver driver= new AndroidDriver(url, dc);	
		
		Thread.sleep(2000);
		driver.findElement(By.id("com.bitbar.testdroid:id/radio0")).click();	
		Thread.sleep(1000);
        WebElement akash =	driver.findElement(By.id("com.bitbar.testdroid:id/radio1"));
        akash.click();
        akash.isEnabled();
        Thread.sleep(1000);
        driver.findElement(By.id("com.bitbar.testdroid:id/editText1")).sendKeys("akash");

		Thread.sleep(1000);
        driver.findElement(By.id("com.bitbar.testdroid:id/button1")).click();
        Thread.sleep(2000);
	}

}
