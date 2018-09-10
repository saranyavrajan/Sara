package wdMethods;

import java.io.File;
import java.io.IOException;
//import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

//import javax.management.RuntimeErrorException;
//import javax.sound.midi.SysexMessage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import week4.Report;

public class SeMethods implements WdMethods
{
	public int i=1;
	public RemoteWebDriver driver;
	Report rpt = new Report();
	
	public void startApp(String browser, String url) 
	{
		try 
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//System.out.println("The Browser "+browser+" Launched Successfully");
		} 
		catch (Exception e) 
		{
			rpt.stepReport("Error Found", "Fail");
		}
		//rpt.stepReport(desc, status);
		
		
	}
	
	public void Wait(long sec)
	{
		try
		{
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			System.err.println("Interrupted Exception");
		}
		
	}
	
	public WebElement locateElement(String locator, String locValue) 
	{		
		try 
		{
			switch(locator) 
			{
				case "id"	 : return driver.findElementById(locValue);
				case "class" : return driver.findElementByClassName(locValue);
				case "xpath" : return driver.findElementByXPath(locValue);
				case "linktext" : return driver.findElementByLinkText(locValue);
				case "dropdown" : return driver.findElementById(locValue);				
			}
		} 
		catch (NoSuchElementException e) 
		{
			System.err.println("NoSuchElementException");			
		}
		catch (WebDriverException e) 
		{
			System.err.println("WebDriverException");			
		}
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) 
	{
		return null;
	}
	
	public void type(WebElement ele, String data) 
	{		
		ele.sendKeys(data);
	}
	
	public void cleartext(WebElement ele)
	{
		ele.clear();
	}
	
	public void clickWithNoSnap(WebElement ele) 
	{
		ele.click();
		//System.out.println("The Element "+ele+" Clicked Successfully");	
	}
		
	@Override
	public void click(WebElement ele) 
	{
		ele.click();
		//System.out.println("The Element "+ele+" Clicked Successfully");		
	}

	@Override
	public String getText(WebElement ele) 
	{
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) 
	{
		Select sel = new Select(ele);
		sel.selectByVisibleText(value);
		//sel.selectByValue(value);
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) 
	{
		
	}

	@Override
	public boolean verifyTitle(String expectedTitle) 
	{
		String currTitle = driver.getTitle();
		if(currTitle.contains(expectedTitle))
		{
			System.out.println("Verified Title");
			return true;
		}
		else
		{
			System.out.println("Title Not Verified");
			return false;
		}		
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) 
	{
	
	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) 
	{
	
	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) 
	{
	
	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) 
	{
	
	}

	@Override
	public void verifySelected(WebElement ele) 
	{
	
	}

	@Override
	public void verifyDisplayed(WebElement ele) 
	{
	
	}

	@Override
	public void switchToWindow(int index) 
	{
	
	}

	@Override
	public void switchToFrame(WebElement ele) 
	{
	
	}

	@Override
	public void acceptAlert() 
	{
	
	}

	@Override
	public void dismissAlert() 
	{
	
	}

	@Override
	public String getAlertText() 
	{
		return null;
	}
	
	public void takeSnap() 
	{
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try 
		{
			FileUtils.copyFile(src, des);
		} catch (IOException e) 
		{
			System.err.println("IOException");
		}
		i++;
	}

	@Override
	public void closeBrowser() 
	{
		driver.close();
	}

	@Override
	public void closeAllBrowsers() 
	{
	
	}	
}