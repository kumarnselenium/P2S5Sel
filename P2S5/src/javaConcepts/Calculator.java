package javaConcepts;

public class Calculator {

	int iInput1, iInput2, iOutput;
	
	void addition()
	{
		iOutput = iInput1 + iInput2;
		System.out.println(iOutput);
	}
	
	void substarction()
	{
		iOutput = iInput1 - iInput2;
		System.out.println(iOutput);
	}
	
	void multiplication()
	{
		iOutput = iInput1 * iInput2;
		System.out.println(iOutput);
	}
	
	void division()
	{
		iOutput = iInput1 / iInput2;
		System.out.println(iOutput);
	}
	
	public static void main(String args[])
	{
		
		Calculator oCalc = new Calculator();
		
		int a;
		int b;
		a = 20;
		b=4;
		
		oCalc.iInput1 = a;
		oCalc.iInput2 = b;
		
		oCalc.addition();	//792, 2526
		oCalc.substarction(); //2526, 315
		oCalc.multiplication();// 0925, 15
		oCalc.division(); //26278, 826
				
		AmazonUsingMainMethod oA = new AmazonUsingMainMethod();
		oA.logout();
		oA.main(args);
	}
	
}
