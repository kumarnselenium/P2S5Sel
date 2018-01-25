package javaConcepts;

import org.junit.Test;

public class JavaLoops {

	public void ifLoopEx()
	{
		String sState = "CA";
		
		if(sState=="CA")
		{
			System.out.println("Provide 5% tax rebate");
		}
		
	}
	
	public void ifElseLoopEx()
	{
		String sState = "NY";
		
		if(sState=="CA")
		{
			System.out.println("Provide 5% tax rebate");
		}
		else
		{
			System.out.println("Provide 8% tax rebate");
		}
		
	}
	
	public void ifNestedElseLoopEx()
	{
		String sState = "NY";
		
		if(sState=="CA")
		{
			System.out.println("Provide 5% tax rebate");
		}
		else if(sState=="NY")
		{
			System.out.println("Provide 8% tax rebate");
		}
		else
		{
			System.out.println("Provide 3% tax rebate");
		}
		
	}
	
	public void ifNestedElseLoopExType2()
	{
		String sState = "CA";
		String sGender = "Female";
		
		if(sState=="CA")
		{
			if(sGender=="Male")
			{
				System.out.println("Provide 4% tax rebate");
			}
			else
			{
				System.out.println("Provide 5% tax rebate");
			}
		}
		else if(sState=="NY")
		{
			System.out.println("Provide 8% tax rebate");
		}
		else
		{
			System.out.println("Provide 3% tax rebate");
		}
		
	}

	public void switchLoop()
	{
		String sState = "CA";
		String sGender = "Female";
		
		switch (sState) {
			case "CA":
					if(sGender=="Male")
					{
						System.out.println("Provide 4% tax rebate");
					}
					else
					{
						System.out.println("Provide 5% tax rebate");
					}
					break;
			case "NY":
					System.out.println("Provide 8% tax rebate");
					break;
			default:
					System.out.println("Provide 3% tax rebate");
					break;
		}
	}
	
	public void exWhileLoop()
	{
		int i =100;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	}
	
	public void exDoWhileLoop()
	{
		int i =100;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
	}
	
	public void exForFORLoop()
	{
		for(int i=10; i>=1; i--)
		{
			System.out.println(i);
		}
	}
	@Test
	public void exForLogicalOperators()
	{
		String sState = "NY";
		int iIncome = 69000;
		
		/*if(sState =="CA" || iIncome <50000)
		{
			System.out.println("10% tax rebate");
		}
		else
		{
			System.out.println("3% tax rebate");
		}*/
		
		if(sState !="CA")
		{
			System.out.println("10% tax rebate");
		}
	}
}






















