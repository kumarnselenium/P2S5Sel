package javaConcepts;

import java.io.File;
import java.io.FileNotFoundException;

public class ExForExceptions {
	public static void main(String args[]) throws Exception
	{
		AmazonUsingMainMethod oAmazon = new AmazonUsingMainMethod();
				
		//TS1_CreateOrder
		oAmazon.login();
		oAmazon.purchaseItems();
		oAmazon.logout();
		Thread.sleep(3000);
		
		//Ts2_ModifyOrder
		oAmazon.login();
		oAmazon.updateOrder();
		oAmazon.logout();
		Thread.sleep(3000);
		
		//TS3_DeleteOrder		
		oAmazon.login();
		oAmazon.removeOrder();
		oAmazon.logout();
	}
	
	public void exForTryCatch()
	{
		AmazonUsingMainMethod oAmazon = new AmazonUsingMainMethod();
				
		//TS1_CreateOrder
		oAmazon.login();
		oAmazon.purchaseItems();
		oAmazon.logout();
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Ts2_ModifyOrder
		oAmazon.login();
		oAmazon.updateOrder();
		oAmazon.logout();
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//TS3_DeleteOrder		
		oAmazon.login();
		oAmazon.removeOrder();
		oAmazon.logout();
	}
}
