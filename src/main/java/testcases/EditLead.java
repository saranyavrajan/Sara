//verify title of the page
//check verify title method
package testcases;
//import org.junit.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class EditLead extends SeMethods
{
	@Test
	//@Test(priority = 0, dependsOnGroups = "testgroups") 
	public void EditLeadTestCase()
	{
		startApp("chrome","http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName,"DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword,"crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);		
		WebElement elecrmsfa = locateElement("class", "crmsfa");
		click(elecrmsfa);
		WebElement eleLeads = locateElement("linktext", "Leads");
		click(eleLeads);
		WebElement eleFindLeads = locateElement("linktext", "Find Leads");
		click(eleFindLeads);
		WebElement eleFirstName = locateElement("xpath", "(//input[@name='firstName'])[3]");
		type(eleFirstName, "Sara");
		WebElement elebtnFindLeads = locateElement("xpath", "//button[text()='Find Leads']");
		click(elebtnFindLeads);
		Wait(2000);
		WebElement eleFirstLead = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(eleFirstLead);
		boolean verifyTitle = verifyTitle("View Lead");
		System.out.println(verifyTitle);
		WebElement elebtnEdit = locateElement("linktext", "Edit");
		click(elebtnEdit);
		WebElement eleCompName = locateElement("id", "updateLeadForm_companyName");
		cleartext(eleCompName);
		type(eleCompName, "ABC Networking");
		WebElement elebtnUpdate = locateElement("xpath", "//input[@value='Update']");
		click(elebtnUpdate);
		Wait(1000);
		//closeBrowser();
	}
}
