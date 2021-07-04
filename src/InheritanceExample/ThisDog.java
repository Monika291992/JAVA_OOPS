package InheritanceExample;

public class ThisDog {
	
	//Use of this keyword in inheritance, basically used to access current class variable of private access modifier
	//Since current class variable is private it won't be accessible from outside this class,Hence this keyword used
	
	private String name; // Current class variable won't be able to access outside this class since accessmodifier is private
	
	ThisDog(String name)  // Constructor
	{
		this.name = name;  // this.name used to refer current class variable or global variable
	}

	public String getName()  //Getter Method
	{
		return this.name; // or return name;
	}

	public String speak()
	{
		return "woof";  // used hardcoded retun value 
		
	}

}
