package PageObjectModel;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Test_unit_converter extends Base_class{
@Test 
	public void test_uc() {
	 Unit_converter_objects uc= new Unit_converter_objects(driver);
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
     System.out.println("All is good.");
    }

}


