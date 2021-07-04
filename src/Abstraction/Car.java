package Abstraction;

//Absract keyword is mandatory in method if method is abstract
public class Car extends Vehicle {

	// After extending the vehicle class used can inherited only Abstract method
	// or Unconcrete method,No conrete
	// Method can be inherited

	public static void main(String[] args) {

		Car c = new Car(); // Since we cann't Instantiate Abstrct method, We
							// create object of Car class and
		c.PriceDetails(); // Since we extended the Vehicle class we called
							// c.getData() method
		c.getData();
	}

	@Override
	public void getData() {
		System.out.println("This is abstract method");

	}

	@Override
	public void colorDetails() {

	}

}
