package Day2;

import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {

  }
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("platformName", "Android");

		dc.setCapability("appium:deviceName", "Medium Phone API 32");
		dc.setCapability("appium:skipServerInstallation", "true");
		dc.setCapability("appium:noReset", "true");
		dc.setCapability("appium:platformVersion", "12.0");
	    dc.setCapability("appium:app","‪C:\\appium1\\com.the511plus.MultiTouchTester.apk");
		 URL url=new URL("http://127.0.0.1:4723/wd/hub");
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
