package week2.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Gowrisankar\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://legacy.crystalcruises.com/");		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		System.out.println(driver.getTitle());
		
		Set<String> allWin = driver.getWindowHandles();
		List<String> allList = new ArrayList<String>();
		allList.addAll(allWin);
		
		driver.switchTo().window(allList.get(1));
		
		System.out.println(driver.getTitle());
		driver.findElementByPartialLinkText("View Off").click();
		
		allWin = driver.getWindowHandles();
		allList = new ArrayList<String>();
		allList.addAll(allWin);
		driver.switchTo().window(allList.get(2));
		System.out.println(driver.getTitle());
		
		
	}

}
