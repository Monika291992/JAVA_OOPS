package Inheritance;

//Parent_Class
//Additional Services

public class IntGuidelines {

	String EngineType;  // String variable is defined but it's not declared
	int PassengerCapcity;
	String PlaneType = "Boeing"; // String variable defined and it's value is declared
	
	public static void main(String[] args) {
		
		IntGuidelines ig = new IntGuidelines();
		ig.TravelProtection();
		ig.Baggage();

	}
	
	public void TravelProtection()
	{
		System.out.println("TravelProtection shoulld be 1st option in additional services");
		
	}
	
	public void Baggage()
	{
		
		System.out.println("Baggage shold be included in additional services");
	}

	public void TravelAssist()
	{	
		System.out.println("TravelAssist should be included in additional services");
	}
	
}
