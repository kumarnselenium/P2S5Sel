package sWDConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DiffBrowsers {
	//@Test
	
	public void launchApplication(String sBrowserType, String sURL)
	{
		WebDriver oBrowser;
		
		if(sBrowserType.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver 2");
			oBrowser = new ChromeDriver();
			
		}else if(sBrowserType.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/narkandukuri/Downloads/geckodriver 2");
			oBrowser = new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver 2");
			oBrowser = new ChromeDriver();
		}
			
		//2. Launch URL
		oBrowser.get(sURL);
		
		//Maximize the browser
		oBrowser.manage().window().maximize();
		
	}
	
	
	public void eBaySearchChrome() throws InterruptedException
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver 2");
		WebDriver oBrowser;
		//ChromeDriver oBrowser;
		oBrowser = new ChromeDriver();
		
		//2. Launch www.ebay.com	
		oBrowser.get("https://www.ebay.com/");
		
		Thread.sleep(4000);
		
		//3. Enter "laptop" in search text box	
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		//4. Click on Search Button	
		oBrowser.findElement(By.id("gh-btn")).click();
	}
	
	//@Test
	public void eBaySearchFirefox() throws InterruptedException
	{
		//1. Open Firefox Browser	
		System.setProperty("webdriver.gecko.driver", "/Users/narkandukuri/Downloads/geckodriver 2");
		FirefoxDriver oBrowser = new FirefoxDriver();
		
		//2. Launch www.ebay.com	
		oBrowser.get("https://www.ebay.com/");
		
		Thread.sleep(4000);
		
		//3. Enter "laptop" in search text box	
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		//4. Click on Search Button	
		oBrowser.findElement(By.id("gh-btn")).click();
	}
	
	@Test
	public void eBaySearchIE() throws InterruptedException
	{
		//1. Open Chrome Browser	
	/*	System.setProperty("webdriver.gecko.driver", "/Users/narkandukuri/Downloads/geckodriver 2");
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);

		//2. Launch www.ebay.com	
		oBrowser.get("https://www.ebay.com/");
		
		Thread.sleep(4000);
		
		//3. Enter "laptop" in search text box	
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		//4. Click on Search Button	
		oBrowser.findElement(By.id("gh-btn")).click();*/
	}
}

