package FinalKeyword;

public class InitializeFinalVariable {
	
	final int speedLimit;
	
	InitializeFinalVariable(){
		
		speedLimit =70;
		System.out.println(speedLimit);		
	}

	public static void main(String[] args) {
		
		new InitializeFinalVariable();
		

	}

}
