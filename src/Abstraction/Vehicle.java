package Abstraction;

//An abstract class can have both abstract(without Body) and concrete methods(With Body)
public abstract class Vehicle {

	int speed;
	String Color;
	int priceDetails = 200;

	public static void main(String[] args) {

		// Vehicle v = new Vehicle(); // Cannot intentiate abstract class coz
		// even if we created obj
		// and try to call method it has no use coz method does not have body

	}

	// Abstract Method
	public abstract void getData();

	public abstract void colorDetails(); // Without Body Implementation

	public void PriceDetails() // With body implementation
	{
		System.out.println("Price Details are " + priceDetails);
	}

}
