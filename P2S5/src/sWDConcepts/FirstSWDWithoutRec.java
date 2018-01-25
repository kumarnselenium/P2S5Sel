package sWDConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSWDWithoutRec {
	
	@Test
	public void eBaySearch() throws InterruptedException
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
	}
	
}
