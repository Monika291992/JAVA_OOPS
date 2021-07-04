package FinalKeyword;

public class FinalVariable {
	
	 int speedlimit = 90;  
	
	//If you make any variable as final, you cannot change the value of final variable(It will be constant).
	
	//final int speedlimit = 90; //final variable 
	
	void run(){
		
	     speedlimit = 100;
		System.out.println(speedlimit); // Output:Compile Time Error
	}

	public static void main(String[] args) {
		
		FinalVariable b = new FinalVariable();
		b.run();

	}

}
