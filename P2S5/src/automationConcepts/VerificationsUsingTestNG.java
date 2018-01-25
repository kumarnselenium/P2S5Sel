package automationConcepts;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationsUsingTestNG {
	
	@Test
	public void eMICalculator() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/Users/narkandukuri/Downloads/chromedriver 2");
		 
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.deal4loans.com/Contents_Calculators.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);	
		
		Assert.assertTrue("Fail, EMI Calculator page is not loaded successfully", driver.findElements(By.xpath("//h1[contains(.,'EMI Calculator')]")).size()>0);
		System.out.println("Pass, EMI Calculator page loaded successfully");
		
		//V2
		try
		{
			Assert.assertTrue("Fail, EMI Calculator page is not loaded successfully", driver.findElement(By.xpath("//h1[contains(.,'EMI Calculator')]")).isDisplayed());
			System.out.println("Pass, EMI Calculator page loaded successfully");
		}catch(Exception e)
		{
			System.out.println("Fail, EMI Calculator page is not loaded successfully");
		}
		
		//selecting loan amount
		driver.findElement(By.id("Loan_Amount")).clear();
		driver.findElement(By.id("Loan_Amount")).sendKeys("20000");
		
		driver.findElement(By.name("rate")).click();
		
		//V3
		String sExpectedLoanAmountText = "Twenty Thousand";
		String sActualLoanAmountText = driver.findElement(By.id("wordloanAmount")).getText();
		
		Assert.assertTrue("Fail, Loan Amount text is not displayed successfully", sActualLoanAmountText.contains(sExpectedLoanAmountText));
		System.out.println("Pass, Loan Amount text is displayed successfully");
	
		//selecting Interest Rate (Reducing)
		driver.findElement(By.name("rate")).clear();
		driver.findElement(By.name("rate")).sendKeys("11.5");

		//selecting	Loan Tenure
		driver.findElement(By.name("months")).clear();
		driver.findElement(By.name("months")).sendKeys("250");

		//Click on Calculate Button
		driver.findElement(By.name("button")).click();
		
		//V4 - verify EMI
		String sExpectedCalcEMI = "211.12";
		String sActualCalcEMI = driver.findElement(By.name("pay")).getAttribute("value");
		
		Assert.assertTrue("Fail, Calculated EMI is not as expected", sExpectedCalcEMI.equals(sActualCalcEMI));
		System.out.println("Pass, Calculated EMI is as expected");
		
	}
	
}




