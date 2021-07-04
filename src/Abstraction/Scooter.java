package Abstraction;

//An abstract class can extend only one class or one abstract class at a time
//Use extends keyword to inherit the properties

public class Scooter extends Bike {

	public static void main(String[] args) {

		Scooter s = new Scooter();
		s.getData(); // Method from parent class

	}

}
