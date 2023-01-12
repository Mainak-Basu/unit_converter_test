package resources;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class Base_class {
	    public AndroidDriver driver;
		@BeforeClass
		public void setup() throws MalformedURLException{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Z585R8TSRWQKSGQO");
		dc.setCapability("noReset", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
	   driver = new AndroidDriver(url,dc);
	   
		}
		
}
