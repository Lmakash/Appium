package Assignmate;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class End_to_End_Appium1 {
	AndroidDriver driver;
	  @Test (dataProvider = "Test")
	  public void Test(String name) throws InterruptedException, IOException {
		  long timestamp=new Date().getTime();
		  System.out.println("Time is :"+timestamp);

	  
		  POM_end_to_end obj =new POM_end_to_end(driver);
		  
	  obj.radiobutton101();
	  obj.radiobutton2nd();
	  obj.enterfirstname(name);
	  obj.clickonbutton();
	  }
	  
	  
	  @BeforeMethod
	  public void beforeMethod() throws MalformedURLException {
		  DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("platformName", "Android");
			dc.setCapability("appium:deviceName", "Medium Phone API 32");
			dc.setCapability("appium:skipServerInstallation","true");
			dc.setCapability("appium:noReset", "true");
			dc.setCapability("appium:platformVersion","12.0");
			dc.setCapability("appium:app","‪C:\\appium1\\bitbar-sample-app.apk");	
			
			
			URL url=new URL("http://127.0.0.1:4723/wd/hub");  // you have to go on appium server;
		 driver= new AndroidDriver(url, dc);	
			
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }


	  @DataProvider
	  public Object[][] Test() {
	    return new Object[][] {
	      new Object[] {"Akash"},
	      
	    };
	  }
	}