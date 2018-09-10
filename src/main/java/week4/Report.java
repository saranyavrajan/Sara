package week4;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report 
{
	public ExtentTest test, testData;
	public ExtentReports extent;
	
	//To create HTML File and start writing a report
	//@BeforeSuite
	public void startReport()
	{
		ExtentHtmlReporter html = new ExtentHtmlReporter("./Reports/result.html");
		html.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(html);		
	}
	
	//To create a report
	//@BeforeClass
	public void startTestCase(String testName,String desc)
	{
		test=extent.createTest(testName, desc);
	}
	
	//To generate desc based on status
	public void stepReport(String desc, String status)
	{
		if(status.equalsIgnoreCase("PASS"))
		{
			testData.pass(desc);
		}
		else if(status.equalsIgnoreCase("Fail"))
		{
			testData.fail(desc);
		}
	}
	
	//To write Author and Category
	//BeforeMethod
	public void BMAuthorCat(String author,String Category)
	{
		testData = test.createNode("Leads");
		test.assignAuthor(author);
		test.assignCategory(Category);		
	}
	
	//To end Report
	public void endReport()
	{
		extent.flush();
	}
	
	
	
	
	
}
