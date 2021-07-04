package Constructor;

public class PrivateConDemo {

	public static void main(String[] args) {
		
		//Can't create the object if private constructor is available in the class
		
		PrivateConstructor.add(4, 5); //static method can be accessed by the class name
		PrivateConstructor.sub(7, 3);

	}

}
