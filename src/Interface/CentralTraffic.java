package Interface;

//An interface can have only abstract methods
public interface CentralTraffic {
	
	//INTERFACE
	// Interface doen't have body in it's method
	// But if we put default Access Modifier then it can be executed without error 
	// They can be called by in any other class
	
	
	 void GreenGo(); // If we not add abstract keyword in interface, Compiler automatically added it
	public void RedStop();
	public void FlashingYellow();
	//public abstract void RedAlert(); this is also valid
	
	default void RunWayLength()
	{
		System.out.println("RunWay Length");
	}
 }
