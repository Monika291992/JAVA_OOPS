package Constructor;

public class Constructor1 {

	private String Name;
	
	public static void main(String[] args) {
		Constructor1 cs = new Constructor1("Austin");
		cs.getData("MaxPayne");
		Constructor1 cs1 = new Constructor1("Rock");
	}

	public Constructor1(String Name) {
		this.Name = Name;
		System.out.println("This is deffault constructor " + Name);
	}

	public void getData(String Name) {
		this.Name = Name;
		 System.out.println(Name);
		//return Name;
	}
}
