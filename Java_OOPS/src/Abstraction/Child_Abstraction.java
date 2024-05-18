package Abstraction;

public class Child_Abstraction extends Parent_Abstraction {
	
	public static void main(String []args)
	{
		Child_Abstraction  Call_Obj = new Child_Abstraction();
		Call_Obj.Normal_Method();
		Call_Obj.AB_Method();
	}

	public void AB_Method()
	{
		System.out.println("This is AB Method");
	}
	

}
