package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrames {

	public static void main(String[] args) throws InterruptedException 
	{
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gowrisankar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//ClassName objectName = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*//Load URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		//String alert = driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Sara");	
		Thread.sleep(2000);
		//System.out.println(alert);							
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();*/	
		}

}
