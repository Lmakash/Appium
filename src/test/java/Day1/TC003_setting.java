package Day1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TC003_setting {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		final DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("deviceName", "Android Emulator");
	    capabilities.setCapability("appPackage", "com.android.settings");
	    capabilities.setCapability("appActivity", ".Settings");
	    URL url1=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url1,capabilities);
}
}
