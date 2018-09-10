package week1.day3;

//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gowrisankar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		//Enter UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//Click Login Buttons
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByClassName("crmsfa").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@id='ext-gen248']").sendKeys("Sara");
		driver.findElementByXPath("//button[@id='ext-gen334']").click();
		driver.findElementByXPath("//img[@id='ext-gen602']").click();
		

	}

}
