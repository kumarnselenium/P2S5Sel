package javaConcepts;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	@Test
	public void test()
	{
		//System.setProperty("webdriver.gecko.driver","/Users/narkandukuri/Downloads/geckodriver");
		//WebDriver oDriver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","/Users/narkandukuri/Downloads/chromedriver 2");
		WebDriver oDriver = new ChromeDriver();
		oDriver.get("http://www.seleniumhq.org/");
	}
}
