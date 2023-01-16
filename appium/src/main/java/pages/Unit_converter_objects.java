package pages;
import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
public class Unit_converter_objects {
	private AndroidDriver driver;
	
	public Unit_converter_objects(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}  
	@AndroidFindBy(id="kr.sira.unit:id/tab0_input")
    public WebElement inputbox;
	@AndroidFindBy(id="kr.sira.unit:id/tab0_num1")
    public WebElement num1;
	@AndroidFindBy(id="kr.sira.unit:id/tab0_selector")
    public WebElement selector;
	@AndroidFindBy(id="android:id/select_dialog_listview")
	public WebElement list_view;
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
	        ".scrollIntoView(new UiSelector().text(\"furlong\"))")
	WebElement furlongx;
	@AndroidFindBy(id="kr.sira.unit:id/tab0_numok")
	public WebElement ok_button;
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
	        ".scrollIntoView(new UiSelector().text(\"201,168,000\"))")
	WebElement first;
	@AndroidFindBy(xpath="//android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView")
	public WebElement second;
	@AndroidFindBy(xpath="//android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView")
	public WebElement third;
	
	public void clickoninput() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(inputbox));
		inputbox.click();
	}
	public void clickonnum1() {
		num1.click();
	}
	public void clickonselector() {
		selector.click();
	}
	public void gotofurlongandclick() {
		furlongx.click();
	}
	public void click_ok_button() {
		ok_button.click();
	}
	public void scroll() {
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence scrolla = new Sequence(finger1, 1);
		scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
		PointerInput.Origin.viewport(), 300, 600));
		scrolla.addAction(finger1.createPointerDown(0));
		scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),
		PointerInput.Origin.viewport(),300, 900));
		scrolla.addAction(finger1.createPointerUp(0));
		driver.perform(Arrays.asList(scrolla));
	}
	public boolean verifyfirst() {
		return first.getText().equals("201,168,000");
	}
	public boolean verifysecond() {
		return second.getText().equals("201,16");
	}
	public boolean verifythird() {
		return third.getText().equals("20,116.");
	}
}
