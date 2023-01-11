package PageObjectModel;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
public class Test_Play_Store_and_unit_converter extends Base_class{
	
    @SuppressWarnings("deprecation")
	@Test(priority=0)
    public void playstore_test() {
    	driver.activateApp("com.android.vending");
    	Paystore_Objects play= new Paystore_Objects(driver);
    	play.tap1();
    	play.send();
    	play.tap2();
    	play.tap3();
    	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        play.clickopen();
    }
    @SuppressWarnings("deprecation")
	
    
    @Test (priority=1)
	public void test_uc() {
	 Unit_converter_objects uc= new Unit_converter_objects(driver);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 uc.clickoninput();
	 uc.clickonnum1();
	 uc.clickonselector();
	 uc.gotofurlongandclick();
	 uc.click_ok_button();
	 uc.scroll();
	 Assert.assertTrue(uc.verifyfirst());
	 Assert.assertTrue(uc.verifysecond());
	 Assert.assertTrue(uc.verifythird());
	 driver.terminateApp("kr.sira.unit");
	 driver.removeApp("kr.sira.unit");
	 driver.terminateApp("com.android.vending");
     System.out.println("All is good.");
    }
    }
