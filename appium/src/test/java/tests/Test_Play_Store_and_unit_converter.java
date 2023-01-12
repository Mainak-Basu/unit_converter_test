package tests;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import pages.Paystore_Objects;
import pages.Unit_converter_objects;
import resources.Base_class;
public class Test_Play_Store_and_unit_converter extends Base_class{


@Feature("App search")
@Story("Unit converter searh")
@Description("PlayStore verification")
	@SuppressWarnings("deprecation")
	@Test(priority=0)
    public void playstore_test(){
		Allure.step("Open Play Store app.");
    	driver.activateApp("com.android.vending");
    	Paystore_Objects play= new Paystore_Objects(driver);
    	Allure.step("Go to searchbar and click.");
    	play.tap1();
    	Allure.step("Type unit converter in the textfield.");
    	play.send();
    	Allure.step("Click on correct option.");
    	play.tap2();
    	Allure.step("Click on install button");
    	play.tap3();
    	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    	Allure.step("Click on open button when it appears");
        play.clickopen();
    }

@Feature("App operations")
@Story("Unit converter operations")
@Description("conversion verifications")
	@SuppressWarnings("deprecation")
	@Test (priority=1)
	public void test_uc() {
	 Unit_converter_objects uc= new Unit_converter_objects(driver);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 Allure.step("Click on input tab.");
	 uc.clickoninput();
	 Allure.step("Click on one.");
	 uc.clickonnum1();
	 Allure.step("Click on unit selector.");
	 uc.clickonselector();
	 Allure.step("Scroll down and click on furlong.");
	 uc.gotofurlongandclick();
	 Allure.step("Click on OK button.");
	 uc.click_ok_button();
	 uc.scroll();
	 Allure.step("First verification.");
	 Assert.assertTrue(uc.verifyfirst());
	 Allure.step("Second verification.");
	 Assert.assertTrue(uc.verifysecond());
	 Allure.step("Third verification.");
	 Assert.assertTrue(uc.verifythird());
	 Allure.step("Closing unit converter app.");
	 driver.terminateApp("kr.sira.unit");
	 Allure.step("Uninstalling unit converter app.");
	 driver.removeApp("kr.sira.unit");
	 Allure.step("Closing Googlr Play Store app.");
	 driver.terminateApp("com.android.vending");
     System.out.println("All is good.");
    }
    }
