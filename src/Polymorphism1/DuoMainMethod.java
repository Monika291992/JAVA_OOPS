package Polymorphism1;

public class DuoMainMethod {

	public static void main(String[] args) {
		
		System.out.println("1st String main method");
		DuoMainMethod dm = new DuoMainMethod();
		dm.main(10);
	}
	
	public static void main (int a){
		
		System.out.println("2nd int main method");
	}
}
