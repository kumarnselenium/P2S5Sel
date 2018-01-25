package sWDConcepts;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
import com.sun.jna.platform.FileUtils;


public class SpecialCases {

	WebDriver oBrowser;
	
	public void launchApplication(String sBrowserType, String sURL)
	{
		//WebDriver oBrowser;
		
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

	public void captureScreenshot(String sPath, String sFileName) throws InterruptedException, IOException
	{
		//Type casting ==> WebDriver to takeScreenshot for the purpose of capturing the screenhot
		TakesScreenshot oScn = (TakesScreenshot) oBrowser;
		
		//oCapturedScreenhot - it will have screenshot info, but this is not a physical
		File oCapturedScreenhot = oScn.getScreenshotAs(OutputType.FILE);
		
		//Creates a Physical Empty file
		File oScnSht = new File(sPath + "/" + sFileName + ".jpeg"); 
		
		Files.copy(oCapturedScreenhot, oScnSht);
		
	}
	
	public void handlingMenu() throws InterruptedException
	{
		launchApplication("Chrome", "https://www.ebay.com/");
		
		//Mouse related(Actions) operations on Browser(oBrowser)
		Actions oAct = new Actions(oBrowser);
		
		//Move cursor on to a particular element
		oAct.moveToElement(oBrowser.findElement(By.linkText("Motors")));
		
		//oAct.moveToElement(oBrowser.findElement(By.linkText("Vehicles")));
		
		//It builds and perform
		oAct.build().perform();
		
		Thread.sleep(3000);
		
		oBrowser.findElement(By.partialLinkText("Vehicles")).click();
		
	}
	
	public void captureScreenshot() throws InterruptedException, IOException
	{
		launchApplication("Chrome", "http://www.nasdaq.com/");
		captureScreenshot("/Users/narkandukuri/Documents/Personal/Sel" , "eBayScreenshot"); 
	}
	
	public void handlingAlerts() throws InterruptedException
	{
		launchApplication("Chrome", "http://www.nasdaq.com/symbol/adp/real-time");
		
		//Make sure Checkbox is selected
		if(!oBrowser.findElement(By.id("cookiepref")).isSelected())
		{
			oBrowser.findElement(By.id("cookiepref")).click();
		}
		
		//Unclear the Checkbox
		oBrowser.findElement(By.id("cookiepref")).click();
		
		Thread.sleep(4000);
		
		//Switch the focus from Browser to the Alert
		Alert oAlt = oBrowser.switchTo().alert();
		
		//Get text from Alert
		System.out.println(oAlt.getText());
		
		//Accept
		oAlt.accept();
		
		//Reject
		//oAlt.dismiss();
		
		
	}
	
	public void handlingMultipleBrowsers() throws InterruptedException
	{
		launchApplication("Chrome", "https://www.cigna.com/");
		System.out.println(oBrowser.getTitle());
		//Get Parent Browser ID
		String sParentID = oBrowser.getWindowHandle();
		oBrowser.findElement(By.linkText("Cigna Medicare")).click();
		
		Thread.sleep(3000);
		
		//Retrieve all the browser Ids
		Set<String> sAllBrowserIDs = oBrowser.getWindowHandles();
		
		//Iterate through each Browser Id and whenever its not equal to Parent ID -> which is nothing but Child Id
		for(String sEachBrowserID:sAllBrowserIDs)
		{
			if(!(sEachBrowserID.equals(sParentID)))
			{
				//Switch the Focus
				oBrowser.switchTo().window(sEachBrowserID);
				//Exit the For Loop
				break;
			}
		}
		
		System.out.println(oBrowser.getTitle());
		//Click on 'Contact Us' link in Cigna Medicare page
		oBrowser.findElement(By.xpath("//a[contains(text(),'Medicare Advantage')]")).click();
		
	}
	
	public void handlingMoreThanOneChildBrowser() throws InterruptedException
	{
		launchApplication("Chrome", "https://www.cigna.com/");
		System.out.println(oBrowser.getTitle());
		//Get Parent Browser ID
		String sParentID = oBrowser.getWindowHandle();
		oBrowser.findElement(By.linkText("Cigna Medicare")).click();
		
		Thread.sleep(3000);
		
		//Retrieve all the browser Ids
		Set<String> sAllBrowserIDs = oBrowser.getWindowHandles();
		
		//Iterate through each Browser Id and whenever its not equal to Parent ID -> which is nothing but Child Id
		for(String sEachBrowserID:sAllBrowserIDs)
		{
			//Switch the Focus to each Child Browser
			oBrowser.switchTo().window(sEachBrowserID);
			
			if(oBrowser.getTitle().contains("British Airways"))
			{
				//Exit the For Loop
				break;
			}
		}
		
		System.out.println(oBrowser.getTitle());
		//Click on 'Contact Us' link in Cigna Medicare page
		oBrowser.findElement(By.xpath("//a[contains(text(),'Medicare Advantage')]")).click();
		
	}
	
	@Test
	public void handlingFrames() throws InterruptedException
	{
		launchApplication("Chrome", "http://www.proquest.com/about/careers/current-career-opportunities.html");
		
		//Switch the focus to Frame
		oBrowser.switchTo().frame(oBrowser.findElement(By.className("careers")));
		
		Select uiCountry = new Select(oBrowser.findElement(By.id("location")));
		uiCountry.deselectAll();
		uiCountry.selectByVisibleText("Africa");
		Thread.sleep(2000);
		uiCountry.selectByVisibleText("Argentina");
	}
	
}
























