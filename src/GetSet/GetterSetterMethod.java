package GetSet;

public class GetterSetterMethod {

//getter and setter are two conventional methods that are used for retrieving and updating value of a variable.
// https://www.codejava.net/coding/java-getter-and-setter-tutorial-from-basics-to-best-practices
	
	private String Books; // Class or Instance variable
	
	public GetterSetterMethod(String Books)  // Constructor
	{
		this.Books = Books;
	}

	public String getBooks() //getterMethod
	{
		return Books;
	}

	public void setBooks(String Books) //setterMethod
	{
		this.Books = Books;
	}
}
