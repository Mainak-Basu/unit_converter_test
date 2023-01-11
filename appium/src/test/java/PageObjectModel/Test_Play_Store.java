package PageObjectModel;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
public class Test_Play_Store extends Base_class{
	
    @SuppressWarnings("deprecation")
	@Test
    public void playstore_test() {
    	driver.activateApp("com.android.vending");
    	Paystore_Objects play= new Paystore_Objects(driver);
    	play.tap1();
    	play.send();
    	play.tap2();
    	play.tap3();
    	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    	play.tap4();
    }
}
