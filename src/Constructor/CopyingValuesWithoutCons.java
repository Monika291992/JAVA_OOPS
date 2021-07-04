package Constructor;

//Copying values without constructor
//We can copy the values of one object into another by assigning the objects values to another object. In this case, there is no 
//need to create the constructor.

public class CopyingValuesWithoutCons {
	
	int id;
	String name;
	
	//constructor to initialize integer and string
	CopyingValuesWithoutCons(int a, String b){
		
		id = a;
		name = b;
	}
	
    public CopyingValuesWithoutCons() {
	
	}

	public void display(){
		
		System.out.println(id+ " " +name);
	}

	public static void main(String[] args) {
		
		CopyingValuesWithoutCons cv = new CopyingValuesWithoutCons(111, "Mish");
		CopyingValuesWithoutCons cv1 = new CopyingValuesWithoutCons();
		cv1.id = cv.id;
		cv1.name = cv.name;
		cv.display();
		cv1.display();

	}

}
