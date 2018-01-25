package automationConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerificationsUsingJUnit {
	
	@Test
	public void eMICalculator() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/Users/narkandukuri/Downloads/chromedriver 2");
		 
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.deal4loans.com/Contents_Calculators.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);	
		
		Assert.assertTrue(driver.findElements(By.xpath("//h1[contains(.,'EMI Calculator')]")).size()>0, "Fail, EMI Calculator page is not loaded successfully");
		System.out.println("Pass, EMI Calculator page loaded successfully");
		
		//V2
		try
		{
			Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(.,'EMI Calculator')]")).isDisplayed(), "Fail, EMI Calculator page is not loaded successfully");
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
		
		Assert.assertTrue(sActualLoanAmountText.contains(sExpectedLoanAmountText), "Fail, Loan Amount text is not displayed successfully");
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
		
		Assert.assertTrue(sExpectedCalcEMI.equals(sActualCalcEMI), "Fail, Calculated EMI is not as expected");
		System.out.println("Pass, Calculated EMI is as expected");
		
	}
	
}




