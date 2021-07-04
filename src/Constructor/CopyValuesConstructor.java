package Constructor;

//There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor in C++.

//There are many ways to copy the values of one object into another in Java. They are:

//By constructor
//By assigning the values of one object into another
//By clone() method of Object class

public class CopyValuesConstructor {

	int id;
	String name;
	
	//constructor to initialize integer and string
	CopyValuesConstructor(int a, String b){
		
		id = a;
		name = b;
	}
	//constructor to initialize another object 
	CopyValuesConstructor(CopyValuesConstructor s){
		
		id = s.id;
		name = s.name;		
	}
	
	public void display(){
		
		System.out.println(id+ " " +name);
	}
	
	public static void main(String[] args) {
		
		CopyValuesConstructor cv = new CopyValuesConstructor(110, "Mishti");
		CopyValuesConstructor cv1 = new CopyValuesConstructor(cv);
		cv.display();
		cv1.display();
		
		

	}

}
