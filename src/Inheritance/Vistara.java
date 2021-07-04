package Inheritance;

//Heirarchical INheritance
// Since Class AirAsia & Vistara both extending Class IntGuidelines, Hence this is Heorarical Inheritance

public class Vistara extends IntGuidelines {

	public static void main(String[] args) {

		Vistara vs = new Vistara();
		vs.TravelProtection();
		vs.Baggage(); 
	}
	
	
	public void MultiLevel()
	{	
		System.out.println("Type of Plane"+PlaneType+"inherited from parent class"); //Accessing variable of PlaneType
	}

}
