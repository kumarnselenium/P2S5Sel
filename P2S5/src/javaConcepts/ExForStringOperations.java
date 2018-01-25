package javaConcepts;

import org.junit.Test;

public class ExForStringOperations {

	@Test
	public void exForStrings()
	{
		String str1 = "Welcome Kumar to Walmart..";
		String str2 = "  Thanks for your order. Order Number: 12345 ";
		
		System.out.println(str1.length());	//26
		System.out.println(str1.concat(str2));	//Welcome Kumar to Walmart..  Thanks for your order. Order Number: 12345
		
		if(str1.contains("Kumar"))	//18
		{
			System.out.println("Pass, Contains");
		}
		else
		{
			System.out.println("Fail, Not Contains");
		}
		
		if(str1.equals("Welcome Kumar to walmart.."))	//31
		{
			System.out.println("Pass, Equals");
		}
		else
		{
			System.out.println("Fail, Not Equals");
		}
		
		if(str1.equalsIgnoreCase("Welcome Kumar to walmart.."))	//36
		{
			System.out.println("Pass, Equals");
		}
		else
		{
			System.out.println("Fail, Not Equals");
		}
		
		System.out.println(str2);
		System.out.println(str2.trim());
		String sOrderNum = str2.trim().substring(37, 42);
		System.out.println(sOrderNum);	//12345
		
		System.out.println(str1.replace("Kumar", "Selenium"));	//Welcome Selenium to Walmart..
		
	}
	
	
}
