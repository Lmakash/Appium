package Day2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Appium_stimulator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "Medium Phone API 32");
		dc.setCapability("skipServerInstallation", "true");
		dc.setCapability("noReset", "true");
		dc.setCapability("platformVersion", "12.0");
		dc.setCapability("app", "‪C:\\appium1\\example.apk");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.findElement(By.id("at.markushi.reveal:id/btn_1")).click();
		driver.findElement(By.id("at.markushi.reveal:id/btn_2")).click();
		driver.findElement(By.id("at.markushi.reveal:id/btn_3")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"at.markushi.reveal:id/slow_motion\"]")).click();
		
	}

}
