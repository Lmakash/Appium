package Assignmate;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class POM_end_to_end {
	AndroidDriver driver ;
    By radio = By.id("com.bitbar.testdroid:id/radio1");
    By placeholder = By.xpath("//android.widget.EditText[@resource-id=\"com.bitbar.testdroid:id/editText1\"]");
    By submit = By.id("com.bitbar.testdroid:id/button1");
    By dashboard = By.id("com.bitbar.testdroid:id/textView2");
    
    
    public POM_end_to_end(AndroidDriver driver2) {
        // TODO Auto-generated constructor stub
        this.driver=driver2;
    }
    public void selectRadio() {
        driver.findElement(radio).click();
    }
    public void typeName(String name1) {
        driver.findElement(placeholder).sendKeys(name1);
    }
    
    public void clickSubmit() {
        driver.findElement(submit).click();
    }
    
    public boolean isDisplayed() {
        boolean isdisplayed = driver.findElement(dashboard).isDisplayed();
        return isdisplayed;
            }

	
}
