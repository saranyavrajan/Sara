package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
//if id is with nos itself should we exclude
//first link in table correct a?
//y for img we have to use alt locator
public class Login 
{
	public static void main(String[] args) 
	{
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gowrisankar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//ClassName objectName = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		//Enter UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//Click Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		//Click Logout Button
		//String text = driver.findElementById("form").getText();
		//System.out.println(text);	
		
		//driver.findElementByClassName("crmsfa").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf"); //Company Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Saranya"); //First Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Gowrisankar"); //Last Name
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Sara"); //First Name Local
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Gowrisankar"); //LastName Local
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mrs"); //Salutation
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("B.Tech"); //Title
		driver.findElementById("createLeadForm_departmentName").sendKeys("Computer Science Engineering"); //Department
 		driver.findElementById("createLeadForm_annualRevenue").sendKeys("2 Lakh per Annum"); //Annual Revenue
 		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100"); //No of Employees
 		driver.findElementById("createLeadForm_sicCode").sendKeys("Nil"); //SIC Code
 		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Nil"); //Ticker Symbol
 		driver.findElementById("createLeadForm_description").sendKeys("Nil"); //Description
 		driver.findElementById("createLeadForm_importantNote").sendKeys("NIL"); //Important Note
 		//Contact Information
 		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("+91"); //Area Code
 		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9445006464"); //Primary Phone No
 		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("5254"); //Phone Extension
 		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Sara"); //Person to ask for
 		driver.findElementById("createLeadForm_primaryEmail").sendKeys("sarasubsacc@gmail.com"); //Email Id
 		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.google.com"); //Web URL
 		//Primary Address
 		driver.findElementById("createLeadForm_generalToName").sendKeys("Sara"); //To Name
 		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Sara"); //Attention Name
 		driver.findElementById("createLeadForm_generalAddress1").sendKeys("A1 1A, Chitlapakkam"); //Address Line 1
 		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Ashok Avenue"); //Address Line 2
 		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai"); //City
 		driver.findElementById("createLeadForm_generalStateProvinceGeoId").sendKeys("Connecticut"); //State
 		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600064"); //Zip/Postal Code
 		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("600064"); //Zip/Postal Code Extension
 		
 		//driver.findElementByClassName("smallSubmit").click();
		
	}

}
