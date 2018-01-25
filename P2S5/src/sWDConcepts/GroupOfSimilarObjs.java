package sWDConcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupOfSimilarObjs {
	
	public void groupOfUIObjs()
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver 2");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.manage().window().maximize();
		
		//2. Launch www.ebay.com	
		oBrowser.navigate().to("https://www.redflagdeals.com/");
		
		List<WebElement> uiAllDeals = oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
		int iTotalDeals = uiAllDeals.size();
		
		/*
		for(WebElement uiEachObj: uiAllDeals) 
		{
			System.out.println(uiEachObj.getText());
		}
		*/
		
		for(int iEachObj=0; iEachObj<iTotalDeals; iEachObj++)
		{
			System.out.println(uiAllDeals.get(iEachObj).getText());
		}
	}
	
	//@Test
	public void groupOfUIObjsWriteToTextFile() throws FileNotFoundException
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver 2");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.manage().window().maximize();
		
		//2. Launch www.ebay.com	
		oBrowser.navigate().to("https://www.redflagdeals.com/");
		
		List<WebElement> uiAllDeals = oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
		int iTotalDeals = uiAllDeals.size();
		
		//Creates an Empty file
		File oFile = new File("/Users/narkandukuri/Documents/Personal/Sel/deals");
		
		//helps in Writing content to a file
		PrintWriter oPW = new PrintWriter(oFile);
				
		for(int iEachObj=0; iEachObj<iTotalDeals; iEachObj++)
		{
			//Writing to the file
			oPW.println(uiAllDeals.get(iEachObj).getText());
		}
		
		//Save
		oPW.flush();
		
		//Close
		oPW.close();
		
	}
	
	
	//@Test
	public void groupOfUIObjsByTagNameEx() throws FileNotFoundException
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver 2");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.manage().window().maximize();
		
		//2. Launch www.ebay.com	
		oBrowser.navigate().to("https://www.redflagdeals.com/");
		
		//Links
		//List<WebElement> uiAllDeals = oBrowser.findElements(By.tagName("a"));
		
		//Drop Downs/List boxes
		//List<WebElement> uiAllDeals = oBrowser.findElements(By.tagName("select"));
		
		//Checkboxes; Textboxes(text); Radio buttons (radio)
		List<WebElement> uiAllDeals = oBrowser.findElements(By.xpath("//input[@type='checkbox']"));
		int iTotalDeals = uiAllDeals.size();
		
		//Creates an Empty file
		File oFile = new File("/Users/narkandukuri/Documents/Personal/Sel/deals1");
		
		//helps in Writing content to a file
		PrintWriter oPW = new PrintWriter(oFile);
				
		for(int iEachObj=0; iEachObj<iTotalDeals; iEachObj++)
		{
			//Writing to the file
			oPW.println(uiAllDeals.get(iEachObj).getText());
		}
		
		//Save
		oPW.flush();
		
		//Close
		oPW.close();
		
	}
}








