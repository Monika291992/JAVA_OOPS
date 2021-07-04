package Interface;

//An interface can extend any number of interfaces at a time
//Abstract keyword is not mandatory in method, compiler automatically put it
public class IndianTraffic implements CentralTraffic, ContinentalTraffic {

	//CLASS implements interface 
	
	public static void main(String[] args) {
		
		//Here Object of IndianTraffic is created "c" i.e "c" can access all the methods present in CentralTraffic on lef side..
		CentralTraffic c = new IndianTraffic();
		c.GreenGo();
		c.RedStop();
		c.FlashingYellow();
		
		//Here Object of IndianTraffic is created "c" i.e "c" can access all the methods present in ContinentalTraffic on left side.. 
		ContinentalTraffic ct = new IndianTraffic();
		ct.ZebraLines();
		
		//Here Object of IndianTraffic class is created "it" i.e "it" can access all the methods present in the class IndianTraffic on the left side.
		IndianTraffic it = new IndianTraffic(); 
		it.USATrafficSignal();
		it.GreenGo();
	}

	
	//All the methods present in interface are outside the body
	//Methods can be created out side the body with interface.
	
	
	public void USATrafficSignal(){
    System.out.println("USA trafic signla are same as the Continental signals");
		
	}

	@Override
	public void GreenGo() { // it should get public according to the method overriding concept
		System.out.println("Person has move on green signal");
		
	}

	@Override
	public void RedStop() {
		System.out.println("Person has to stop on red signal");
		
	}

	@Override
	public void FlashingYellow() {
		System.out.println("Person has to wait for few seccond on Yellow signal");
		
	}

	@Override
	public void ZebraLines() {
		System.out.println("Person can cross road over Zebra Line");
		
	}
}
