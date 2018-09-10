//try catch in all methods in semethods
//4 testcases using methods
package testcases;
//import org.junit.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.chrome.ChromeDriver;
import wdMethods.SeMethods;

public class CreateLead extends ProjectMethods
{
	@BeforeClass(groups="common")
	public void setdata(String sheetName, String testName, String desc, String author, String Category)
	{
		sheetName="ReadFromExcel";
		testName = "CreateLead";
		desc = "Create a New Lead";
		author = "Sara";
		Category = "Smoke";		
	}
	
	@Test(dataProvider="fetchdata", dependsOnGroups="Common")
	@Parameters({"url", "uname", "pwd"})	
	public void CreateLeadTestCase(String compName, String firstName, String lastName, String Source)
	{
		WebElement elecrLead = locateElement("linktext", "Create Lead");
		click(elecrLead);
		WebElement eleCompName = locateElement("id", "createLeadForm_companyName");
		type(eleCompName, compName);
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		type(eleFirstName, firstName);
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName, lastName);
		WebElement eleSource = locateElement("dropdown", "createLeadForm_dataSourceId");
		selectDropDownUsingText(eleSource, Source);
		Wait(2000);
		/*WebElement eleMarketingCampaign = locateElement("dropdown", "createLeadForm_marketingCampaignId");
		selectDropDownUsingText(eleMarketingCampaign, "Car and Driver");
		WebElement eleFirstNameLocal = locateElement("id", "createLeadForm_firstNameLocal");
		type(eleFirstNameLocal, "Sara");
		WebElement eleLastNameLocal = locateElement("id", "createLeadForm_lastNameLocal");
		type(eleLastNameLocal, "Gowrisankar");
		WebElement eleSalutation = locateElement("id", "createLeadForm_personalTitle");
		type(eleSalutation, "Mrs");
		WebElement eleTitle = locateElement("id", "createLeadForm_generalProfTitle");
		type(eleTitle, "B.Tech");
		WebElement eleDepartment = locateElement("id", "createLeadForm_departmentName");
		type(eleDepartment, "Computer Science Engineering");
		WebElement eleAnnualRevenue = locateElement("id", "createLeadForm_annualRevenue");
		type(eleAnnualRevenue, "2 Lakhs per Annum");
		WebElement elePreferredCurrency = locateElement("id", "createLeadForm_currencyUomId");
		selectDropDownUsingText(elePreferredCurrency, "INR - Indian Rupee");
		WebElement eleIndustry = locateElement("id", "createLeadForm_industryEnumId");
		selectDropDownUsingText(eleIndustry, "General Services");
		WebElement eleNoOfEmployees = locateElement("id", "createLeadForm_numberEmployees");
		type(eleNoOfEmployees, "100");
		WebElement eleOwnership = locateElement("id", "createLeadForm_ownershipEnumId");
		selectDropDownUsingText(eleOwnership, "LLC/LLP");
		WebElement eleSIC = locateElement("id", "createLeadForm_sicCode");
		type(eleSIC, "Nil");
		WebElement eleTickerSymbol = locateElement("id", "createLeadForm_tickerSymbol");
		type(eleTickerSymbol, "Nil");
		WebElement eleDesc = locateElement("id", "createLeadForm_description");
		type(eleDesc, "Description");
		WebElement eleImpNote = locateElement("id", "createLeadForm_importantNote");
		type(eleImpNote, "Important Note");*/
		//Contact Information
		/*WebElement eleAreaCode = locateElement("id", "createLeadForm_primaryPhoneAreaCode");
		type(eleAreaCode, "+91");
		WebElement elePhnNo = locateElement("id", "createLeadForm_primaryPhoneNumber");
		type(elePhnNo, "9445012345");
		WebElement elePhnExt = locateElement("id",	"createLeadForm_primaryPhoneExtension");
		type(elePhnExt, "5254");
		WebElement elePersonToAsk = locateElement("id", "createLeadForm_primaryPhoneAskForName");
		type(elePersonToAsk, "Sara");
		WebElement eleEmail = locateElement("id", "createLeadForm_primaryEmail");
		type(eleEmail, "sara@gmail.com");
		WebElement eleWebURL = locateElement("id", "createLeadForm_primaryWebUrl");
		type(eleWebURL, "www.google.com");
		//Primary Address
		WebElement eleToName = locateElement("id", "createLeadForm_generalToName");
		type(eleToName, "Sara");
		WebElement eleAttName = locateElement("id",	"createLeadForm_generalAttnName");
		type(eleAttName, "Sara");
		WebElement eleAddrLine1 = locateElement("id", "createLeadForm_generalAddress1");
		type(eleAddrLine1, "A1 1A, Chitlapakkam");
		WebElement eleAddrLine2 = locateElement("id", "createLeadForm_generalAddress2");
		type(eleAddrLine2, "Ashok Avenue");
		WebElement eleCity = locateElement("id", "createLeadForm_generalCity");
		type(eleCity, "Chennai");
		WebElement eleStateProv = locateElement("id", "createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingText(eleStateProv, "Connecticut");
		WebElement elePostalCode = locateElement("id", "createLeadForm_generalPostalCode");
		type(elePostalCode, "600064");
		WebElement eleCountry = locateElement("id", "createLeadForm_generalCountryGeoId");
		selectDropDownUsingText(eleCountry, "United States");
		WebElement eleZipCodeExt = locateElement("id", "createLeadForm_generalPostalCodeExt");
		type(eleZipCodeExt, "600064");
		WebElement eleSubmit = locateElement("class", "smallSubmit");*/
		//click(eleSubmit);		
	}	
}
