package generic_utilities;
import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class CustomListener extends Base_class implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {					
		try {
			failed_test(result.getMethod().getMethodName(), driver);
		} catch (IOException e) {
			e.printStackTrace();
		}		
       
    }
	
}