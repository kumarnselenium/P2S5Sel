package transport;

public class Ship {

	public static void main(String args[])
	{
		Car OHonda = new Car();		//Initialization 
		
		OHonda.sColor = "Blue";
		OHonda.iNumberOFDoors = 4;
		
		OHonda.start();	
		OHonda.moveForward();
		OHonda.moveBackward();
		OHonda.stop();
		
	}

	
	
}
