package javaConcepts;

public class AmazonUsingMainMethod {

	public void login()
	{
		System.out.println("SWD Logic for Login");
	}
	
	public void purchaseItems()
	{
		System.out.println("SWD Logic for purchaseItems");
	}
	
	public void updateOrder()
	{
		System.out.println("SWD logic for updateOrder");
	}
	
	public void removeOrder()
	{
		System.out.println("SWD Logic for removeOrder");
	}
	
	public void logout()
	{
		System.out.println("SWD Logic for Logout");
		System.out.println();
	}

	public static void main(String args[])
	{
		AmazonUsingMainMethod oAmazon = new AmazonUsingMainMethod();
				
		//TS1_CreateOrder
		oAmazon.login();
		oAmazon.purchaseItems();
		oAmazon.logout();
		
		//Ts2_ModifyOrder
		oAmazon.login();
		oAmazon.updateOrder();
		oAmazon.logout();
		
		//TS3_DeleteOrder		
		oAmazon.login();
		oAmazon.removeOrder();
		oAmazon.logout();
	}
	
}
