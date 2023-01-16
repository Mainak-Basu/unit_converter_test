package pages;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
public class Paystore_Objects{
	private AndroidDriver driver;
		public Paystore_Objects(AndroidDriver driver) {
		this.driver=driver;	
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
      @AndroidFindBy(xpath="//android.view.View[@content-desc=\"Search Google Play\"]")
      public WebElement searchbar;
      @AndroidFindBy(xpath="//android.widget.EditText")
      public WebElement textbox;
      @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=concat('Search for \"unit converter\"',\" \")]")
      public WebElement unitconverteroption;
      @AndroidFindBy(xpath="//android.view.View[@content-desc=\"Install\"]")
      public WebElement install;
      @AndroidFindBy(xpath="//android.view.View[@content-desc=\"Open\"]")
      public WebElement open;
      public void tap1() {
    	  searchbar.click();
      }
      public void send() {
    	  textbox.sendKeys("unit converter");
      }
      public void tap2() {
    	  unitconverteroption.click();
      }
      public void tap3() {
    	  install.click();
      }
      
	public void wait_till_open_appears_and_then_click_open() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(open));
    	  open.click();
      }
}     
      
      