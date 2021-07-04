package Polymorphism1;

public class AutoPromotion {

	public static void main(String[] args) {
		AutoPromotion ap = new AutoPromotion();
		ap.add('a'); // it is a character and it is promoted in integer
		ap.add(10,20,30);
		ap.add("abc"); //give the preference to string type method b/w parent and child.
		ap.add(); //called varargs method
	}
	
//	public void add(int a)
//	{
//		System.out.println("int method");
//	}
	
	public void add(String a)
	{
		System.out.println("string method");
	}
	
	public void add(Object a){ // parent class of string
		
		System.out.println("parent class");
	}
	
	public void add(int...a){
		
		System.out.println("varargs method"); // it accepts multiple argument or no argument called var argument
	}
	
	
}
