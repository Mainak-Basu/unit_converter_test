package appium;

import java.net.MalformedURLException;

import java.net.URL;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.PointerInput;

import org.openqa.selenium.interactions.Sequence;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class real_device_test {

public static void main(String[] args) throws MalformedURLException, InterruptedException {

DesiredCapabilities dc = new DesiredCapabilities();

dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Z585R8TSRWQKSGQO");

dc.setCapability("noReset", true);

dc.setCapability("appPackage", "com.android.vending");

dc.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");

URL url = new URL("http://127.0.0.1:4723/wd/hub");

AndroidDriver driver = new AndroidDriver(url,dc);


WebDriverWait wait0 = new WebDriverWait(driver,Duration.ofSeconds(200));

wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"Search Google Play\"]")));
WebElement searchbox = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Search Google Play\"]"));
searchbox.click();

WebElement textbox = driver.findElement(By.xpath("//android.widget.EditText"));
textbox.sendKeys("unit converter");

WebDriverWait s = new WebDriverWait(driver, Duration.ofSeconds(10));

s.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.LinearLayout[@content-desc=concat('Search for \"unit converter\"',\" \")]"))); 

driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=concat('Search for \"unit converter\"',\" \")]")).click();


WebDriverWait i = new WebDriverWait(driver, Duration.ofSeconds(10));

i.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Install\"]")));
WebElement install = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Install\"]"));
install.click();

WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"Open\"]")));
driver.findElement(By.xpath("//android.view.View[@content-desc=\"Open\"]")).click();

WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(200));

w.until(ExpectedConditions.elementToBeClickable(By.id("kr.sira.unit:id/tab0_input")));

WebElement input = driver.findElement(By.id("kr.sira.unit:id/tab0_input"));

input.click();

WebElement num1= driver.findElement(By.id("kr.sira.unit:id/tab0_num1"));

num1.click();

WebElement selector = driver.findElement(By.id("kr.sira.unit:id/tab0_selector"));

selector.click();

WebDriverWait w2 = new WebDriverWait(driver,Duration.ofSeconds(200));

w2.until(ExpectedConditions.presenceOfElementLocated(By.id("android:id/select_dialog_listview")));

PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

Sequence scroll = new Sequence(finger, 1);

scroll.addAction(finger.createPointerMove(Duration.ofMillis(0),

PointerInput.Origin.viewport(), 325, 1440));

scroll.addAction(finger.createPointerDown(0));

scroll.addAction(finger.createPointerMove(Duration.ofSeconds(1),

PointerInput.Origin.viewport(),325, 1000));

scroll.addAction(finger.createPointerUp(0));

driver.perform(Arrays.asList(scroll));

WebElement furlong = driver.findElement(By.xpath("//android.widget.TextView[14]"));

furlong.click();

driver.findElement(By.id("kr.sira.unit:id/tab0_numok")).click();

PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");

Sequence scrolla = new Sequence(finger1, 1);

scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),

PointerInput.Origin.viewport(), 300, 600));

scrolla.addAction(finger1.createPointerDown(0));

scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),

PointerInput.Origin.viewport(),300, 900));

scrolla.addAction(finger1.createPointerUp(0));

driver.perform(Arrays.asList(scrolla));

List<String> m = new ArrayList<String>();


List<WebElement> data1 = driver.findElements(By.xpath("//android.widget.TextView[@resource-id=\"kr.sira.unit:id/unit_value\"]"));
for(WebElement d: data1) {
	m.add(d.getText());
}



PointerInput fingerx = new PointerInput(PointerInput.Kind.TOUCH, "fingerx");

Sequence scrollc = new Sequence(fingerx, 1);

scrollc.addAction(fingerx.createPointerMove(Duration.ofMillis(0),PointerInput.Origin.viewport(), 325, 1300));

scrollc.addAction(fingerx.createPointerDown(0));

scrollc.addAction(fingerx.createPointerMove(Duration.ofSeconds(1),PointerInput.Origin.viewport(),325, 600));

scrollc.addAction(fingerx.createPointerUp(0));

driver.perform(Arrays.asList(scrollc));
System.out.println("-----------printing lengths----------------------");
List<WebElement> data2 = driver.findElements(By.xpath("//android.widget.TextView[@resource-id=\"kr.sira.unit:id/unit_value\"]"));
for(WebElement c: data2) {
	m.add(c.getText());	
	}

Set<String> s1 = new LinkedHashSet<String>(m);  
for(String q:s1) {
	System.out.println(q);
}
System.out.println("-----------printing currencies----------------------");

driver.findElement(By.xpath("//android.widget.LinearLayout[2]/android.widget.TextView")).click();
driver.findElement(By.id("kr.sira.unit:id/tab1_input")).click();

driver.findElement(By.id("kr.sira.unit:id/tab1_num1")).click();

driver.findElement(By.id("kr.sira.unit:id/tab1_selector")).click();

driver.findElement(By.xpath("//android.widget.ListView/android.widget.TextView[2]")).click();
driver.findElement(By.id("kr.sira.unit:id/tab1_numok")).click();

List<String> m1 = new ArrayList<String>();


List<WebElement> data3 = driver.findElements(By.xpath("//android.widget.TextView[@resource-id=\"kr.sira.unit:id/unit_value\"]"));
for(WebElement d1: data3) {
	m1.add(d1.getText());
}
Set<String> s2 = new LinkedHashSet<String>(m1);  
for(String q1:s2) {
	System.out.println(q1);
}

driver.findElement(By.xpath("//android.widget.LinearLayout[3]/android.widget.TextView")).click();

driver.findElement(By.id("kr.sira.unit:id/tab2_layout1")).click();

driver.findElement(By.id("kr.sira.unit:id/tab2_input")).click();

driver.findElement(By.id("kr.sira.unit:id/tab2_num1")).click();

driver.findElement(By.id("kr.sira.unit:id/tab2_selector")).click();

driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]")).click();
driver.findElement(By.id("kr.sira.unit:id/tab2_numok")).click();
System.out.println("-----------printing forces----------------------");
List<String> m2 = new ArrayList<String>();


List<WebElement> data4 = driver.findElements(By.xpath("//android.widget.TextView[@resource-id=\"kr.sira.unit:id/unit_value\"]"));
for(WebElement d2: data4) {
	m2.add(d2.getText());
}
Set<String> s3 = new LinkedHashSet<String>(m2);  
for(String q2:s3) {
	System.out.println(q2);
}


driver.terminateApp("kr.sira.unit");
driver.removeApp("kr.sira.unit");
System.out.print("Unit converter has been uninstalled.");
driver.terminateApp("com.android.vending");

}

} 