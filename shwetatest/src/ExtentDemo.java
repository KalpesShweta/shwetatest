import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtProcessing;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentDemo {
 
	static  ExtentReports reports;
	static ExtentTest logger;
	
	public static void main(String[] args)
	{
		String filename="sample"+String.valueOf(LocalDateTime.now()) +".html";
		String path="/Users/kalpeshpatel/Documents/ExtentReports/" +filename;
		reports = new ExtentReports(path);
		logger= reports.startTest("Login");
		logger.log(LogStatus.INFO, "we have  entered emialid");
		logger.log(LogStatus.PASS,"Enter the emialid");
		
		logger= reports.startTest("Chnage Password");
		logger.log(LogStatus.INFO, "we have  change passwrod");
		logger.log(LogStatus.PASS,"Change Password");
		
		logger= reports.startTest("Logout");
		logger.log(LogStatus.INFO, "we have  Log out");
		logger.log(LogStatus.FAIL,"Logout");
	
	reports.endTest(logger);
	reports.flush();
	}
}
