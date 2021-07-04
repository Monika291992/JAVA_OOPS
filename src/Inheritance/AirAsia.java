package Inheritance;

//Single Inheritance
//Child_Class
//Inheriting variable of Parent Class
public class AirAsia extends IntGuidelines {

	int Ecofee = 2500;
	String colour;
	int Maxpassenger = 300;
	
	public static void main(String[] args) {

		AirAsia as = new AirAsia();
		as.TravelProtection(); //Accessible from Parent Class
		as.Baggage();          //Accessible from Parent Class
		as.FlightFee();
		as.Engine("Amedus");// passing the parameter at runtime
		
	}
		public void Engine(String EngineType) //Method 1
		{
			//EngineType = "Sabre";   // Accessing variable EngineType locally  from Parent Class
			System.out.println("Economy Class is available ");
			System.out.println("AirAsia is of "+EngineType+" EngineType" );	
		}
		public void FlightFee() //Method 2
		{
			System.out.println("Flight fee for Economy class is " + Ecofee);
		}
		public void plane () 
		{
			System.out.println("This is "+PlaneType+" Plane");  //Accessing variable PlaneType Parent class
		}
	
}
