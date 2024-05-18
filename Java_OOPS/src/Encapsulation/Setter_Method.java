package Encapsulation;

public class Setter_Method {
	
	
	private int ATM_PIN ;
	
	public void Set (int MY_PIN)
	{
		
	 ATM_PIN = MY_PIN;
		
	}
	
	
	public  void Get ()
	{
		System.out.println("Customer ATM PIN is " + ATM_PIN);
	}
	
	
	

}
