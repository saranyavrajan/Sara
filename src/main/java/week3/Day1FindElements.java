package week3;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1FindElements {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		
		/*driver.findElementById("lst-ib").sendKeys("Saranya");
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='btnK']").sendKeys(Keys.ENTER);*/
		
		driver.findElementByName("q").sendKeys("Koushik",Keys.ENTER);
		
		List<WebElement> allList = driver.findElementsByPartialLinkText("Saranya");
		System.out.println(allList.size());
		int size = allList.size();
		//allList.get(0).click();
		Thread.sleep(2000);
		/*for (int i = 0; i < size; i++) 
		{
			for (WebElement a : allList) 
			{
				System.out.println(i + "  " + a.getText());
			}
		}*/
		for (WebElement a : allList) 
		{
			System.out.println(a.getText());
		}
		
		driver.findElementById("lst-ib").sendKeys("Cricket");
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='btnK']").sendKeys(Keys.ENTER);
		//WebElement findElementByXPath = driver.findElementByXPath("//*[contains(text(),'cricket') or contains(text(),'Cricket')");
		

	}

}
