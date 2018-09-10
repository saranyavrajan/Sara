package week2.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM/SFA").click();
		driver.findElementByPartialLinkText("Leads").click();
		driver.findElementByPartialLinkText("Merge Leads").click();
		
		//Click First Img
		driver.findElementByXPath("//img[@alt='Lookup']").click();
				
		//Shift Focus to Find Leads
		Set<String> allWin = driver.getWindowHandles();
		List<String> allList = new ArrayList<String>();
		allList.addAll(allWin);
		driver.switchTo().window(allList.get(1));
		
		//Enter First Name
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("Sara");
		driver.findElementByXPath("//button[@id='ext-gen114']").click();
		Thread.sleep(2000);
		
		//Click First Link
		String LeadId = driver.findElementByXPath("(//a[@class='linktext'])[1]").getText();		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();		
		//driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		
		//Shift Focus to Merge Leads
		allWin = driver.getWindowHandles();
		allList = new ArrayList<String>();
		allList.addAll(allWin);
		driver.switchTo().window(allList.get(0));
		
		Thread.sleep(1000);
				
		//Click Second Img
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
				
		//Shift Focus to Find Leads
		allWin = driver.getWindowHandles();
		allList = new ArrayList<String>();
		allList.addAll(allWin);
		driver.switchTo().window(allList.get(1));
		
		//Enter First Name		
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("Sita");
		driver.findElementByXPath("//button[@id='ext-gen114']").click();		
		Thread.sleep(1000);
		
		//Click Second Link				
		//driver.findElementByXPath("(//a[@class='linktext'])[7]").click();
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();		
		
		//Shift Focus to Merge Leads
		allWin = driver.getWindowHandles();
		allList = new ArrayList<String>();
		allList.addAll(allWin);
		driver.switchTo().window(allList.get(0));		
		//System.out.println(driver.getTitle());
		
		//Click Merge Leads
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		Thread.sleep(1000);
		
		//Handle Alert
		driver.switchTo().alert().accept();
		
		//Click Find Leads
		driver.findElementByPartialLinkText("Find Leads").click();
		
		//Enter Lead Id Text and Click
		driver.findElementByXPath("//input[@id='ext-gen246']").sendKeys(LeadId);
		driver.findElementById("ext-gen334").click();
		
	}
}
