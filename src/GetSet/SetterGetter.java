package GetSet;

public class SetterGetter {
	private String fname;
	private int i;
	
	public String getFname()
	{
		System.out.println(this.fname);
		return this.fname;
		//return this.i;  //We can't get value of different Data Type from getter method
						  //Type mismatch error would be shown
		
	}
	
	public int getint()  // we have to create this getter method, since we can't call different data type from 
						 // a specific getter method
	{
		System.out.println(this.i);
		return this.i=i; // we can set only i=i or this.i=i meaning is same for both
	}	

	public void setfname(String fname, int i)
	{
		this.fname = fname;
		this.i=i;
		
		System.out.println(this.fname + this.i);
	}
}
