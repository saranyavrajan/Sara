package week4;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GenerateReport 
{
	public static void main(String[] args) throws IOException 
	{
		ExtentHtmlReporter html = new ExtentHtmlReporter("./Reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("ProjectMethods", "Login to Leaftaps");
		test.assignAuthor("Sara");
		test.assignCategory("Smoke");
		test.pass("Username entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../Snaps/img1.png").build());
		test.pass("crmsfa entered successfully");
		test.warning("Login may fail");
		extent.flush();		
	}
}
