package Inheritance;

//Child_Class

public class GoAir extends IndianGuidelines {
	
	public static void main(String[] args) {
		
		GoAir ga = new GoAir();
		ga.getSeatdata();
		ga.SeatMap();
	}
	
	public void getSeatdata()
	{
		passengerCapacity = 200;// This variable is defined in Parent(IndianGuideline) & declared in GoAir class 
		                        // Accessing variable of super or parent class
		
		System.out.println("Following IndianGuidelnes");
		System.out.println("Type of seat used in GoAir Airlines are " + seatType);
		System.out.println(+passengerCapacity+ " is the capcaity f GoAir airlines");
		
	}
}
