package SuperKeyword;

//2) super keyword used to invoke immediate parent class method.

public class SuperClassInstanceVar extends Parent {
	
	String name="Hitman"; // instance variable
	
	SuperClassInstanceVar()
	{
		
		System.out.println("This is child Class Constructor");
	}

	public void Data()
	{
		super.superClass(); //Referring to Super Class method which is "superClass"
		String name="Serious Sam";
		System.out.println(name); // referring to [LOCAL VARIABLE]
		System.out.println(this.name); // this.name referring to [CURRENT CLASS VARIABLE] i.e "Hitman"
		System.out.println(super.name);//Since we r using super.name,hence referring to [PARENT CLASS VARIABLE] 
	}
	public static void main(String[] args) {
		
		SuperClassInstanceVar s=new SuperClassInstanceVar(); //Since SuperClass is inherited Parent class, Hence when we create object
		s.Data();                      // It checks for constructor in Parent class as well and then in child class
	}	
}
