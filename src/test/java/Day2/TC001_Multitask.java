package Day2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TC001_Multitask {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("platformName", "Android");

		dc.setCapability("appium:deviceName", "Medium Phone API 32");
		dc.setCapability("appium:skipServerInstallation", "true");
		dc.setCapability("appium:noReset", "true");
		dc.setCapability("appium:platformVersion", "12.0");
	    dc.setCapability("appium:app","‪C:\\appium1\\com.the511plus.MultiTouchTester.apk");
		 URL url=new URL("http://127.0.0.1:4723/wd/hub");
		 AndroidDriver driver=new AndroidDriver(url, dc);
		 
	//	 driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.the511plus.MultiTouchTester:id/touchStr\"]")).click();
		 
	}

}

