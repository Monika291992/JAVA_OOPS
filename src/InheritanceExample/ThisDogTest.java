package InheritanceExample;

public class ThisDogTest {

	public static void main(String[] args) {
		
		ThisDog dg = new ThisDog("Romil");  // Object of class Dog is created and Stringg variable is being passed 
		System.out.println(dg.getName()); /// dg.getName Method ic called which returning name variable
		System.out.println(dg.getName() + " used to do "+dg.speak()+"");
	}
}
