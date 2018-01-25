package javaConcepts;

import transport.Car;
import transport.Train;

public class CalculatorWithIpOutputParameters {
	int iOutput = 0;
	
	public CalculatorWithIpOutputParameters()
	{
			
	}
	
	public CalculatorWithIpOutputParameters(int i1, int i2)
	{
			
	}

	int addition (int iInput1, int iInput2)
	{
		iOutput = iInput1 + iInput2;
		//System.out.println(iOutput);
		return iOutput;
	}
	
	int addition (int iInput1, int iInput2, int iInput3)
	{
		iOutput = iInput1 + iInput2+iInput3;
		//System.out.println(iOutput);
		return iOutput;
	}
	
	int addition (int iInput1, int iInput2, int iInput3, int iInput4)
	{
		iOutput = iInput1 + iInput2+iInput3+iInput4;
		//System.out.println(iOutput);
		//System.out.printl
		return iOutput;
	}
	
	int substarction(int iInput1, int iInput2)
	{
		iOutput = iInput1 - iInput2;
		//System.out.println(iOutput);
		return iOutput;
	}
	
	int multiplication(int iInput1, int iInput2)
	{
		iOutput = iInput1 * iInput2;
		//System.out.println(iOutput);
		return iOutput;
	}
	
	int division(int iInput1, int iInput2)
	{
		iOutput = iInput1 / iInput2;
		//System.out.println(iOutput);
		return iOutput;
	}
	
	String findBestCityInAParticularCountry(String sCountry, String sStateORProv, int iNOfTopCities)
	{
		String abc;
		
		return "Niagara";
	}
	
	boolean willItRain(String sCity) {
		return true;
	}
	
	Train findBestCar(Car oXYZ)
	{
		Train oABC = new Train();
		if(4>5)
		{
			return oABC;
		}
		else
		{
			return oABC;
		}
	}
	
	public static void main(String args[])
	{
		CalculatorWithIpOutputParameters oCalcWithPa = new CalculatorWithIpOutputParameters(2, 3);
		CalculatorWithIpOutputParameters oCalc = new CalculatorWithIpOutputParameters();
		
		System.out.println(oCalc.addition(792, 2526));
		//System.out.println(iOutput);
		
		int substractionOutput = oCalc.substarction(2526, 315);
		System.out.println(substractionOutput);
		System.out.println(oCalc.multiplication(925, 15));
		System.out.println(oCalc.division(26278, 826));
		
		String sWeFoundBestCity = oCalc.findBestCityInAParticularCountry("USA", "CA", 3);
		
		Car oBMW = new Car();
		//Train oXYZ = new Train();
		
		Train oDEF = oCalc.findBestCar(oBMW);
				
	}
	
	
	
	
	
	
	
	
	
	
}
