package javaConcepts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AmazonUsingJUnit {

	@Before
	public void login()
	{
		System.out.println("SWD Logic for Login");
	}
	
	@Test
	public void purchaseItems()
	{
		System.out.println("SWD Logic for purchaseItems");
	}
	
	@Test
	public void updateOrder()
	{
		System.out.println("SWD logic for updateOrder");
	}
	
	@Test
	public void removeOrder()
	{
		System.out.println("SWD Logic for removeOrder");
	}
	
	@After
	public void logout()
	{
		System.out.println("SWD Logic for Logout");
		System.out.println();
	}

}
