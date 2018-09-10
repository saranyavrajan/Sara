package testcases;

import java.io.IOException;

import org.junit.BeforeClass;
/*import org.junit.Test;*/
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;
import week4.ReadFromExcel;
import week4.Report;

public class ProjectMethods extends SeMethods
{
	public String sheetName, author, Category, testName, desc;
	Report rpt = new Report();
	
	@BeforeSuite
	public void startRpt()
	{
		
		rpt.startReport();
	}
	
	@BeforeClass
	public void startTestCase()
	{
		rpt.startTestCase(testName, desc);
	}
	
	@Test(groups="Common")
	@Parameters({"url", "uname", "pwd"})	
	@BeforeMethod
	public void login(String URL, String Username, String Password/*,String author, String Category*/)
	{
		//rpt.BMAuthorCat(author, Category);
		startApp("chrome", URL);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, Username);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, Password);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);		
		WebElement elecrmsfa = locateElement("class", "crmsfa");
		click(elecrmsfa);
		WebElement eleLeads = locateElement("linktext", "Leads");
		click(eleLeads);
	}
	@AfterMethod
	public void close()
	{
		closeBrowser();
	}
	
	@DataProvider(name="fetchdata")
	public String[][] excelData() throws IOException
	{
		ReadFromExcel excel = new ReadFromExcel();
		return excel.getData(sheetName);
	}
	
	@AfterSuite
	public void endRpt()
	{
		rpt.endReport();
	}
}
