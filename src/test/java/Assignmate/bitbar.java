package Assignmate;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.android.AndroidDriver;

public class bitbar {
	  AndroidDriver driver;
	  @Test(dataProvider = "dp")
	  public void f(String name) throws Exception {
	      
		  POM_end_to_end obj = new POM_end_to_end(driver);
	      obj.selectRadio();
	     
	      obj.typeName(name);
	      obj.clickSubmit();
	      Thread.sleep(2000);
	      ExtentReports extent=new ExtentReports();
	        ExtentSparkReporter spark=new ExtentSparkReporter("Bitbar.html");
	        extent.attachReporter(spark);
	        ExtentTest test=extent.createTest("Reports for App working: ");
	      if(obj.isDisplayed()) {
	          System.out.println("PASSED!");
	          test.pass("Passed");
	      }else {
	          Thread.sleep(3000);
	          File sfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	          File dfile = new File("‪C:\\Users\\akash.shendage\\eclipse-workspace\\Feb2024_Appium\\bitbar.png");
	          FileUtils.copyFile(sfile, dfile);
	          String path = dfile.getAbsolutePath();
	          test.fail("Name Not Displayed"
	                  ,MediaEntityBuilder
	                  .createScreenCaptureFromPath(path)
	                  .build());
	          
	      }
	      extent.flush();
	      
	      
	  }
	  @BeforeMethod
	  public void beforeMethod() throws Exception {
	      DesiredCapabilities dc = new DesiredCapabilities();
	        dc.setCapability("platformName", "Android");
	        dc.setCapability("deviceName", "Pixel_3a_API_34_extension_level_7_x86_64");
	        dc.setCapability("skipServerInstallation", "true");
	        dc.setCapability("noReset", "true");
	        dc.setCapability("platformVersion", "14.0");
	        dc.setCapability("app", "‪C:\\\\appium1\\\\bitbar-sample-app.apk");
	        URL url = new URL("http://127.0.0.1:4723/wd/hub");
	        driver = new AndroidDriver(url,dc);
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }


	  @DataProvider
	  public Object[][] dp() throws Exception {
	      File f1 = new File("‪‪C:\\Users\\akash.shendage\\eclipse-workspace\\Feb2024_Appium\\bitbar.xlsx");
	      FileInputStream fis = new FileInputStream(f1);
	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        XSSFSheet sheet = workbook.getSheetAt(0);
	        
	        int rowCount = sheet.getPhysicalNumberOfRows();
	        System.out.println("Row Count: "+rowCount);
	        String[][] data = new String[1][1];
	        
	        for(int i=0;i<rowCount;i++) {
	            data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
	            //data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
	        
	            String name = data[i][0];
	            //String pass = data[i][1];
	            
	            System.out.println("Name: "+name);
	            //System.out.println("Password: "+pass);    
	            
	        }
	        return data;
	  }
	}
