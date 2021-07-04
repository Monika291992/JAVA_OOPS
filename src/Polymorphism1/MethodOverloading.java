package Polymorphism1;

public class MethodOverloading {  // Same class 1st Condition

	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();	
		mo.FirstMethod();
		mo.FirstMethod(1);
		mo.SecondMethod(2,"2nd Condition");
		mo.SecondMethod("2nd Condition", 2);
		mo.ThirdMethod(3);
		mo.ThirdMethod("3rd Condition");
	}
	
	//If we don't pass any argument in another method then compile time error would be occur
	//Same method 2nd Condition
	
	public void FirstMethod() // 3_1) No: of Args condition
	{
		System.out.println("Method Overloading with first condition no: of args");	
	}
		
	public int FirstMethod(int i) // 3_1) No: of Args condition
	{
		System.out.println("Method overloading with first condition no: of args " + i);
		return i;
	}
	
	public void SecondMethod(String Name, int b)// 3_2 Seq of Args condition
	{
		System.out.println("Method overloading with second condition seq of Args (String & int) " + Name + b);
	}
	
	public void SecondMethod(int b, String Name) // 3_2 Seq of Args condition
	{
		System.out.println("Method overloading with second condition seq of Args (int & String) " + b + Name);
	}
	
	public void ThirdMethod(int j) // 3_3 Type of Args
	{
		System.out.println("Method overloading with third condition Type of Args int " + j);
	}
	
	public void ThirdMethod(String SurName) // 3_3 Type of Args
	{
		System.out.println("Method Overloading with third condition Type of Args Strinig " + SurName);
	}
}
