package week1.day2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gowrisankar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//ClassName objectName = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Load URL
/*
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Enter UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//Click Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		//Click Logout Button
		//String text = driver.findElementById("form").getText();
		//System.out.println(text);	
		
		driver.findElementByClassName("crmsfa").click();
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
 		
 		//Find By Visible Text
 		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
 		Select sel = new Select(src);
 		sel.selectByVisibleText("Employee");
 		
 		//Find By Value
 		WebElement src1 = driver.findElementById("createLeadForm_marketingCampaignId");
 		Select sel1 = new Select(src1);
 		sel1.selectByValue("CATRQ_CARNDRIVER");
 		
 		//Print all Options
 		WebElement src2 = driver.findElementById("createLeadForm_industryEnumId");
 		Select sel2 = new Select(src2);
 		List<WebElement>allOptions = sel2.getOptions();
 		int count = allOptions.size();
 		for(int i=0;i<count;i++)
 		{
 			System.out.println(allOptions.get(i).getText());
 		}
 		
 		//Print Last Option
 		WebElement src3 = driver.findElementById("createLeadForm_currencyUomId");
 		Select sel3 = new Select(src3);
 		List<WebElement>allOptions1 = sel3.getOptions();
 		int count1 = allOptions1.size();
 		int b = count1-1;
 		System.out.println(allOptions1.get(b).getText());
 		
 		//Take ScreenShot
 		File src4 = driver.getScreenshotAs(OutputType.FILE);
 		File dec = new File("./Snaps/img1.png");
 		FileUtils.copyFile(src4, dec);*/

 		
 		//driver.findElementByClassName("smallSubmit").click();
		
		driver.get("http://www.leafground.com/");
		driver.findElementByLinkText("Drop down").click();
		
		//Select Training Program using Index
		WebElement src5 = driver.findElementById("dropdown1");
		Select sel4 = new Select(src5);
		sel4.selectByIndex(3);
		
		//Select Training Program Using Text
		WebElement src6 = driver.findElementByName("dropdown2");
		Select sel6 = new Select(src6);
		sel6.selectByVisibleText("Appium");
		
		//Select Training Program Using Value
		WebElement src7 = driver.findElementById("dropdown3");
		Select sel7 = new Select(src7);
		sel7.selectByValue("4");
		
		//Get the number of Dropdown options
		WebElement src8 = driver.findElementByClassName("dropdown");
		Select sel8 = new Select(src8);
		List<WebElement>allOptions2 = sel8.getOptions();
 		int cnt = allOptions2.size();
 		System.out.println(cnt);
		
 		//You can also use SendKeys to select
 		
 		WebElement src9 = driver.findElement(By.name(""));
 		Select sel9 = new Select(src9);
 		sel9.selectByVisibleText("Selenium");
 		sel9.selectByIndex(3);
 		
 		/*List<WebElement>allOptions3 = driver.findElementsByTagName("select");
 		System.out.println(allOptions3.size());
 		System.out.println(allOptions3.get(4).getText());
 		allOptions3.get(4).sendKeys("Appium");*/
 		
 		
		
 		
	}
}
