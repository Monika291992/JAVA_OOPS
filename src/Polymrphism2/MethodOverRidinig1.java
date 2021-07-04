package Polymrphism2;

public class MethodOverRidinig1 extends MethodOverRiding { // 2nd Condition Different class (MethodOverRidinig1)
														   // 4th Condition Inheritance	

	public static void main(String[] args) {
		
		MethodOverRiding mo = new MethodOverRiding();
		mo.Method(); //1
		MethodOverRidinig1 mo1 = new MethodOverRidinig1();
		mo1.Method(); //2

	}
	//public void Method() // No: of args      
	//3_2) public void Method(String str) // type of args      
	//3_3) public void Method(int a, String str) // Seq of args
	public void Method()// 1st Condition Same Method name & 3rd Condition same arguments
	{
		System.out.println("MethodOverRiding Method 2");
	}
       
	//Note: Even after extending the MethodOverRiding method if we create and object of MethodOverRidinig1 and call method
	// then same method will be call his own method even after extending MethodOverRiding
}


