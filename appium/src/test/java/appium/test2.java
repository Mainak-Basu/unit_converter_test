package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class test2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability("noReset", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		driver.activateApp("com.android.vending");
		WebDriverWait wait0 = new WebDriverWait(driver,Duration.ofSeconds(100));
		wait0.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[2]/android.view.View")));
		driver.findElement(By.xpath("//android.view.View[2]/android.view.View")).click();
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(100));
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText")));
		WebElement textbox = driver.findElement(By.xpath("//android.widget.EditText"));
		textbox.sendKeys("unit converter");
		driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc='Search for \"unit converter\"']")).click();
		System.out.println("hogaya");
		
		
		
		
	}

}
