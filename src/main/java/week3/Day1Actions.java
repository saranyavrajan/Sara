package week3;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.jam.internal.elements.BuiltinClassImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.beust.jcommander.JCommander.Builder;

public class Day1Actions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Draggable
		/*driver.navigate().to("https://jqueryui.com/draggable/");		
		driver.switchTo().frame(0);
		WebElement eleDrag = driver.findElementById("draggable");
		//Point location = driver.findElementByXPath("//iframe[@class='demo-frame']").getLocation();
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(eleDrag, 587, 184).perform();*/
		
		//Selectable
		/*driver.navigate().to("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		Actions builder = new Actions(driver);
		WebElement ele1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement ele3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement ele5 = driver.findElementByXPath("//li[text()='Item 5']");
		WebElement ele7 = driver.findElementByXPath("//li[text()='Item 7']");
		builder.sendKeys(Keys.CONTROL).click(ele1).click(ele3).click(ele5).click(ele7).release().perform();	*/
		
		//Sortable
		/*driver.navigate().to("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		Actions builder = new Actions(driver);
		WebElement ele1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement ele4 = driver.findElementByXPath("//li[text()='Item 4']");
		builder.clickAndHold(ele1).dragAndDropBy(ele1, 0, ele4.getLocation().getY()).release().perform();*/	
		
		driver.navigate().to("https://www.indeed.co.in/Fresher-jobs");
		Thread.sleep(2000);
		//WebElement lnk1 = driver.findElementByXPath("(//div[@class='row result clickcard'])/a[1]");
		Actions builder = new Actions(driver);
		
		WebElement lnk1 = driver.findElementByXPath("(//a[@rel='noopener nofollow'])[1]");		
		
		builder.contextClick(lnk1).sendKeys(Keys.CONTROL+"\t").sendKeys(Keys.ENTER).sendKeys(Keys.ESCAPE).release().perform();
		//builder.contextClick(lnk1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		
		//First Page
		Set<String> allWin = driver.getWindowHandles();
		List<String> allList = new ArrayList<String>();
		allList.addAll(allWin);		
		driver.switchTo().window(allList.get(1));		
		System.out.println(driver.getTitle());
		
		//Main Page
		//allWin = driver.getWindowHandles();
		allList = new ArrayList<String>();
		allList.addAll(allWin);		
		driver.switchTo().window(allList.get(0));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		
		WebElement lnk2 = driver.findElementByXPath("(//a[@rel='noopener nofollow'])[2]");
		builder.contextClick(lnk2).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).sendKeys(Keys.ESCAPE).build().perform();
		
		//Sec Page
		allWin = driver.getWindowHandles();
		allList = new ArrayList<String>();
		allList.addAll(allWin);	
		driver.switchTo().window(allList.get(2));
		System.out.println(driver.getTitle());
		
		//Main Page
		allWin = driver.getWindowHandles();
		allList = new ArrayList<String>();
		allList.addAll(allWin);		
		driver.switchTo().window(allList.get(0));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		WebElement lnk3 = driver.findElementByXPath("(//a[@rel='noopener nofollow'])[3]");
		builder.contextClick(lnk3).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).release().perform();
		
		//Third Page
		allWin = driver.getWindowHandles();
		allList = new ArrayList<String>();
		allList.addAll(allWin);		
		driver.switchTo().window(allList.get(3));
		System.out.println(driver.getTitle());
		
		//Main Page
		allWin = driver.getWindowHandles();
		allList = new ArrayList<String>();
		allList.addAll(allWin);		
		driver.switchTo().window(allList.get(0));
		System.out.println(driver.getTitle());		
	}
}
