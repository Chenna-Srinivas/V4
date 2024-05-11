package I_TestListner;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImplementation implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	Reporter.log("Test Execution Started", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Execution Failed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {

	Reporter.log("Test Execution Successfully completed...",true);
	}

	
	
}
