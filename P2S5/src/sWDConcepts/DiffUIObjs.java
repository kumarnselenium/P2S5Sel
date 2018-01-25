package sWDConcepts;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class DiffUIObjs {
	Capabilities chromeCapabilities = DesiredCapabilities.chrome();
	  Capabilities firefoxCapabilities = DesiredCapabilities.firefox();
	 
	/*  @Test
	  public void main() throws MalformedURLException, InterruptedException {
	    WebDriver chrome = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeCapabilities);
	    WebDriver firefox = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxCapabilities);

	    // run against chrome
	    chrome.get("https://www.google.com");
	    System.out.println(chrome.getTitle());

	    // run against firefox
	    firefox.get("https://www.google.com");
	    System.out.println(firefox.getTitle());
	    Thread.sleep(10000);
	    chrome.quit();
	    firefox.quit();
	  }
*/
	  //@Test
	public void handlingLink() throws InterruptedException
	{
		//1. Open Chrome Browser	
		//System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver 2");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//2. Launch www.ebay.com	
		oBrowser.get("https://www.ebay.com/");
		
		Thread.sleep(4000);
		
		//3. Enter "laptop" in search text box	
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		//4. Click on Search Button	
		oBrowser.findElement(By.id("gh-btn")).click();
		
		//5. Click on Advanced link
		oBrowser.findElement(By.linkText("Advanced")).click();
	}

	public void handlingCheckbox() throws InterruptedException
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver 2");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//2. Launch www.ebay.com	
		oBrowser.get("https://www.ebay.com/");
		
		Thread.sleep(4000);
		
		//3. Enter "laptop" in search text box	
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		//4. Click on Search Button	
		oBrowser.findElement(By.id("gh-btn")).click();
		
		//5. Click on Advanced link
		oBrowser.findElement(By.linkText("Advanced")).click();
		
		Thread.sleep(4000);
		//6. Make sure that the Price Range checkbox selected
	/*	if(oBrowser.findElement(By.id("_mPrRngCbx")).isSelected())
		{
			//nothing
		}
		else
		{
			oBrowser.findElement(By.id("_mPrRngCbx")).click();
		}*/
		
		if(!oBrowser.findElement(By.id("_mPrRngCbx")).isSelected())
		{
			oBrowser.findElement(By.id("_mPrRngCbx")).click();
		}		
	}
	
	public void handlingRadioButton() throws InterruptedException
	{
		String sLocationOption = "PreferredLoc";
		
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver 2");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//2. Launch www.ebay.com	
		oBrowser.get("https://www.ebay.com/");
		
		Thread.sleep(4000);
		
		//3. Enter "laptop" in search text box	
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		//4. Click on Search Button	
		oBrowser.findElement(By.id("gh-btn")).click();
		
		//5. Click on Advanced link
		oBrowser.findElement(By.linkText("Advanced")).click();
		
		Thread.sleep(4000);
		//6. Make sure that the Price Range checkbox selected
		if(!oBrowser.findElement(By.id("_mPrRngCbx")).isSelected())
		{
			oBrowser.findElement(By.id("_mPrRngCbx")).click();
		}	
		
		Thread.sleep(4000);
		//7. Select Location
		if(sLocationOption.equals("PreferredLoc"))
		{
			oBrowser.findElement(By.id("LH_PrefLocRadio")).click();	//From Preferred location
			
		}
		else
		{
			oBrowser.findElement(By.id("LH_LocatedInRadio")).click();	//Located In
		}
	}

	public void handlingDropDown() throws InterruptedException
	{
		String sLocationOption = "PreferredLoc";
		
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver 2");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//2. Launch www.ebay.com	
		oBrowser.get("https://www.ebay.com/");
		
		Thread.sleep(4000);
		
		//3. Enter "laptop" in search text box	
		WebElement uiSearchTextBox = oBrowser.findElement(By.id("gh-ac"));
		uiSearchTextBox.clear();
		uiSearchTextBox.sendKeys("laptop");
		
		//4. Click on Search Button	
		oBrowser.findElement(By.id("gh-btn")).click();
		
		//5. Click on Advanced link
		oBrowser.findElement(By.linkText("Advanced")).click();
		
		Thread.sleep(4000);
		//6. Make sure that the Price Range checkbox selected
		if(!oBrowser.findElement(By.id("_mPrRngCbx")).isSelected())
		{
			oBrowser.findElement(By.id("_mPrRngCbx")).click();
		}	
		
		Thread.sleep(4000);
		//7. Select Location
		if(sLocationOption.equals("PreferredLoc"))
		{
			oBrowser.findElement(By.id("LH_PrefLocRadio")).click();	//From Preferred location	
		}
		else
		{
			oBrowser.findElement(By.id("LH_LocatedInRadio")).click();	//Located In
		}
		
		WebElement uiDropDown = oBrowser.findElement(By.id("_sargnSelect"));
		Select uiPreLocCountry = new Select(uiDropDown);
		
		uiPreLocCountry.selectByVisibleText("Asia");
		Thread.sleep(3000);
		
		uiPreLocCountry.selectByValue("-1&saslc=2");
		Thread.sleep(3000);
		
		uiPreLocCountry.selectByIndex(2);
		
		System.out.println(uiPreLocCountry.getOptions().size());
		
		
	}
	
	public void browserIoerations() throws InterruptedException
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver 2");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.manage().window().maximize();
		
		//2. Launch www.ebay.com	
		oBrowser.navigate().to("https://www.ebay.com/");
		
		//3. Enter "laptop" in search text box	
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		//4. Click on Search Button	
		oBrowser.findElement(By.id("gh-btn")).click();
		
		System.out.println("Title: " + oBrowser.getTitle());
		
		System.out.println("Current URL: " + oBrowser.getCurrentUrl());
		
		//System.out.println("Current URL: " + oBrowser.getPageSource());
		
		Thread.sleep(4000);
		
		oBrowser.navigate().back();
		
		Thread.sleep(4000);
		
		oBrowser.navigate().forward();
		Thread.sleep(4000);
		
		oBrowser.close();
		

	}
	
	
	@Test
	public void exForComplexXPATH()
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver 2");
		ChromeDriver oBrowser = new ChromeDriver();
		String sCompany = "ADVM";
		oBrowser.manage().window().maximize();
		
		//2. Launch www.ebay.com	
		oBrowser.navigate().to("http://www.nasdaq.com/");
		
		//Last Sale
		System.out.println(oBrowser.findElement(By.xpath("//a[contains(.,'" + sCompany + "')]/ancestor::td/following-sibling::td")).getText());
		//Change %
		System.out.println(oBrowser.findElement(By.xpath("//a[contains(.,'" + sCompany + "')]/ancestor::td/following-sibling::td[2]/span")).getText());
		//Share volume
		System.out.println(oBrowser.findElement(By.xpath("//a[contains(.,'" + sCompany + "')]/ancestor::td/following-sibling::td[3]")).getText());
		
		
		

	}
}














