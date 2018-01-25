package javaConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonUsingTestNG {

	@BeforeMethod
	public void login()
	{
		System.out.println("SWD Logic for Login");
		
	}
	
	@Test (priority=1)
	public void purchaseItems()
	{
		System.out.println("SWD Logic for purchaseItems");
	}
	
	@Test (priority=354)
	public void updateOrder()
	{
		System.out.println("SWD logic for updateOrder");
	}
	
	@Test (priority=399)
	public void removeOrder()
	{
		System.out.println("SWD Logic for removeOrder");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("SWD Logic for Logout");
		System.out.println();
	}

}
