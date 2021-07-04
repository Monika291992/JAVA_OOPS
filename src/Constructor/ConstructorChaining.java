package Constructor;

public class ConstructorChaining {
	
	ConstructorChaining(){
		
		this(10);
	}
	
	ConstructorChaining(int a){
		
		this("Monika", 27);
		System.out.println("a = " +a);	
	}
	
	ConstructorChaining(String b, int c){
		
		System.out.println("b = " +b);
		System.out.println("c = " +c);	
	}

	public static void main(String[] args) {
		
		ConstructorChaining cc = new ConstructorChaining();
		

	}

}
