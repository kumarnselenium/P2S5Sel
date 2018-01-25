package javaConcepts;

import transport.Car;
import transport.Train;

public class CalculatorWithInputPrameters {

	int iOutput;
	
	void addition (int iInput1, int iInput2)
	{
		iOutput = iInput1 + iInput2;
		System.out.println(iOutput);
	}
	
	void substarction(int iInput1, int iInput2)
	{
		iOutput = iInput1 - iInput2;
		System.out.println(iOutput);
	}
	
	void multiplication(int iInput1, int iInput2)
	{
		iOutput = iInput1 * iInput2;
		System.out.println(iOutput);
	}
	
	void division(int iInput1, int iInput2)
	{
		iOutput = iInput1 / iInput2;
		System.out.println(iOutput);
	}
	
	void findBestCityInAParticularCountry(String sCountry, String sStateORProv, int iNOfTopCities)
	{
		
	}
	
	void findBestCar(Car oXYZ)
	{
		
	}
	
	public static void main(String args[])
	{
		CalculatorWithInputPrameters oCalc = new CalculatorWithInputPrameters();
		
		oCalc.addition(792, 2526);
		oCalc.substarction(2526, 315);
		oCalc.multiplication(925, 15);
		oCalc.division(26278, 826);
		
		oCalc.findBestCityInAParticularCountry("USA", "CA", 3);
		
		Car oBMW = new Car();
		//Train oXYZ = new Train();
		
		oCalc.findBestCar(oBMW);
				
	}
	
}
