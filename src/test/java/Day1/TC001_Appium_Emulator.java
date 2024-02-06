package Day1;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TC001_Appium_Emulator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		// TODO Auto-generated method stub
       DesiredCapabilities dc= new DesiredCapabilities();
               dc.setCapability("PlatformName", "Android");
    		   dc.setCapability("deviceName", "Medium Phone API 32");
    		 URL url=new URL("http://127.0.0.1:4723/wd/hub");
    		 
    		 
    		 AndroidDriver driver=new AndroidDriver(url,dc);
    		
 			
}

}
