package Polymorphism1;

//1 By Changing the return type

public class ChngRetrunType {

	public static void main(String[] args) {
		
		ChngRetrunType moe = new ChngRetrunType();
		//moe.Car(1);

	}
	
	//void Car(int i) // Compile time error
	{
		System.out.println("int method");
	}
	
	//int  Car(int i)  //Compile time error
	{
		System.out.println("int method");
	}

}
