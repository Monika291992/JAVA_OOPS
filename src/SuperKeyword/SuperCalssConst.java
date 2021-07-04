package SuperKeyword;

//3) super() keyword is used to invoke immediate parent class constructor.

public class SuperCalssConst extends Parent{
	
	String name ="Sam";
	int age =29;
	
	SuperCalssConst(String Surname, int age) // Constructor
	{
		//super();   // Even if we don't use super() even though parent class constructor would be invoked, Since we are extending it.
		System.out.println(name + age);
	}
	
	public void Data() //Method
	{
		String name="Serious Sam"; //Local Variable
		super.superClass(); //Referring to Super Class method which is "superClass"
		System.out.println(super.name);//Since we r using super.name,hence referring to [PARENT CLASS VARIABLE] 
	}
	
	public static void main(String[] args) {
		
		SuperCalssConst sc=new SuperCalssConst("Dave", 29);
	}
 }
