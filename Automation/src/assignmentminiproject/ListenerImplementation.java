package assignmentminiproject;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class ListenerImplementation extends BaseClass implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("TestScript is passed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getName();//it will return currentn @Test running method name
		String time = LocalDate.now().toString().replace(":", "-");
		Reporter.log("TestScript is failed",true);
		TakesScreenshot ts = (TakesScreenshot)sDriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+time+".png");		
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TestScript is skipped");
	}

}
