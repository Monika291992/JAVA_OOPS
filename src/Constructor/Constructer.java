package Constructor;

public class Constructer {
	
	//Java Supports three types of constructors:

	//Default Constructor (No Args Construtor)(Created by Compiler) this is automatically created when not defined by user
	//User Defined Constructor(No Args Construtor)
	//Parameterized constructor
	
	//1) Constructor doesn't include return type or return any value
	//2) Constructor name should be same as class name.
	//3) Whenever object is created implicit or default constructor would be called.
	
	//Each time a new object is created at least one constructor will be invoked.

	//Car c = new Car()       //Default constructor invoked
	//Car c = new Car(name); //Parameterized constructor invoked
	
	
	//Default Constructor
	public Constructer()
	{
		System.out.println("This is constructor it not iclude return type");
	}
	
	//Parameterized Constructor one String variable passed
	public Constructer(String First_Name, String Last_Name)
	{
		System.out.println("This is Parameterized constructor even if we pass any string variable it wont retun any value");
		System.out.println(First_Name + Last_Name);
	}
	
	//This constructor is not called since object is not created for the same
	public Constructer(int EnginePowerCC)
	{
		System.out.println("This is Parameterized constructor even if we pass any string variable it wont retun any value");
		System.out.println(EnginePowerCC);
	}
	
	
	public static void main(String[] args) 
	{
		// If any constructor is defined then java compiler won't look for implicit constructor
		// Which can be seen in normal cases
	    // We dodn't call IndiGoEngine method after creating object, Hence it's not called
		// Since we didn't passed any string variable while creating object, Hence default
	    // constructor would be called
	  // Constructer cs = new Constructer();	
	   //After passing String variable while creating another object
	 Constructer cs1 = new Constructer("IndiGo", "Airline");
	   //Constructor cs2 = new Constructor(3200);
	}
	
	  //Method include return type
      public void IndiGoEngine()
      {
    	  System.out.println("IndiGo airline is using Amedeus Engine");
      }
}
