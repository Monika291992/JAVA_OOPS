package Inheritance;

//MultiLevel Inheritance.

public class IndiGo extends AirAsia {

	public static void main(String[] args) {
		
		AirAsia as = new IndiGo();
		System.out.println(as.Maxpassenger);
		
		IndiGo ig = new IndiGo();
		ig.Engine("Amedus");
		ig.plane();
		ig.TravelProtection(); //SingleLevel Inheritance, Since IndiGo is extends AirAsia & AirAsia extends IntGuidelines
		ig.Baggage();    
		ig.AirlineColor();
		

	}
		public void AirlineColor()
		{
			colour = "Red";
			System.out.println("IndiGo Airline is of "+colour+" in India");
			System.out.println(Maxpassenger);
		}
	
}
