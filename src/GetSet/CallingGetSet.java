package GetSet;

public class CallingGetSet {

	public static void main(String[] args) {
		
		GetterSetterMethod gsm = new GetterSetterMethod("InfoSec testing"); // Passing parameter in object calls
		gsm.setBooks("Pentesting"); //if setter method is used then parameter passed in object call is overwrite by setter method parameter
		System.out.println(gsm.getBooks()); // Since parameter passed in object call is overwrite be setBooks 
	}
}
