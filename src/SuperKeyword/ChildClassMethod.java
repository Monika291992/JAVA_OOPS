package SuperKeyword;

//2) super keyword used to invoke immediate parent class method.

public class ChildClassMethod extends Parent {
	
	String name="Hitman"; // instance variable

	public void Data() //Method
	{
		String name="Serious Sam"; //Local Variable
		super.superClass(); //Referring to Super Class method which is "superClass"
		System.out.println(super.name);//Since we r using super.name,hence referring to [PARENT CLASS VARIABLE] 
	}
	public static void main(String[] args) {
		
		ChildClassMethod s=new ChildClassMethod();//Since SuperClass is inherited Parent class, Hence when we create object
		s.Data();            //object It checks for constructor in Parent class as well and then in child class
	}	
}
