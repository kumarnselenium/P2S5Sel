package transport;

public class Car {

	String sColor;
	float fLength;		
	int iNumberOFDoors;		
	boolean bIsAutoTransmission;		
			
	public Car()
	{
		
	}

	public Car(String sCarColor, int iCarNOfDoors)
	{
		sColor = sCarColor;
		iNumberOFDoors = iCarNOfDoors;
	}
	
	public void moveForward()		
	{		
		System.out.println("Logic related to moveForward");
	}		
			
	void moveBackward()		
	{		
		System.out.println("Logic related to move backward");	
	}		
			
	void start()		
	{		
		System.out.println("Logic related to start");	
	}		
			
	void stop()		
	{		
		System.out.println("Logic related to stop");	
	}	
	
	public static void main(String args[])
	{
		Car oBMW;
		oBMW = new Car();		//Initialization 
		
		oBMW.sColor = "Red";
		oBMW.bIsAutoTransmission = true;
		
		oBMW.moveForward();
		oBMW.moveBackward();
		
		
		Car oToyota;				//Declare
		oToyota = new Car("Red", 2);		//Assigning
	}
	
}













