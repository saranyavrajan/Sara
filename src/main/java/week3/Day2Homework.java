package week3;

import org.apache.xmlbeans.impl.xb.xsdschema.LocalComplexType;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Day2Homework extends SeMethods
{
	@Test
	public void CreateLead() 
	{
		startApp("chrome", "http://leaftaps.com/opentaps");		
		WebElement eleUserName = locateElement("id", "username");
		//type(eleUserName,"DemoSalesManager");
		type(eleUserName,"123");
		
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);		
		WebElement elecrmsfa = locateElement("class", "crmsfa");
		click(elecrmsfa);
		WebElement eleLeads = locateElement("linktext", "Leads");
		click(eleLeads);
		WebElement elecrLead = locateElement("linktext", "Create Lead");
		click(elecrLead);
		WebElement eleCompName = locateElement("id", "createLeadForm_companyName");
		type(eleCompName, "Sara");
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		type(eleFirstName, "Sara");
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName, "Gowrisankar");
		WebElement eleSource = locateElement("dropdown", "createLeadForm_dataSourceId");
		selectDropDownUsingText(eleSource, "Employee");
		
		WebElement eleSubmit = locateElement("class", "smallSubmit");
		click(eleSubmit);
		
		
	}

}
