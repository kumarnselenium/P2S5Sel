package automationConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	
	public void exImplicitWait() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/Users/narkandukuri/Downloads/chromedriver 2");
		 
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.deal4loans.com/Contents_Calculators.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);	
		
		//selecting loan amount
		driver.findElement(By.id("Loan_Amount123")).clear();
		driver.findElement(By.id("Loan_Amount")).sendKeys("3000000");

		//selecting Interest Rate (Reducing)
		driver.findElement(By.name("rate")).clear();
		driver.findElement(By.name("rate")).sendKeys("11.5");

		//selecting	Loan Tenure
		driver.findElement(By.name("months")).clear();
		driver.findElement(By.name("months")).sendKeys("250");

		//Click on Calculate Button
		driver.findElement(By.name("button")).click();
	}
	

	@Test
	public void exExplicitWait() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/Users/narkandukuri/Downloads/chromedriver 2");
		 
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.deal4loans.com/Contents_Calculators.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);	
		
		//selecting loan amount
		driver.findElement(By.id("Loan_Amount")).clear();
		driver.findElement(By.id("Loan_Amount")).sendKeys("3000000");

		//selecting Interest Rate (Reducing)
		driver.findElement(By.name("rate")).clear();
		driver.findElement(By.name("rate")).sendKeys("11.5");

		//selecting	Loan Tenure
		driver.findElement(By.name("months")).clear();
		driver.findElement(By.name("months")).sendKeys("250");

		//Click on Calculate Button
		driver.findElement(By.name("button")).click();
		
		//Thread.sleep(300000);
		
		WebDriverWait oWDW = new WebDriverWait(driver, 20);
		oWDW.until(ExpectedConditions.textToBePresentInElementValue(driver.findElement(By.name("pay")), "abc"));
		
		System.out.println(driver.findElement(By.name("pay")).getTagName());
		
	}
	
}
