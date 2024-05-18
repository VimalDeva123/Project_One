package Encapulation_Tasks;

public class Print_Employe_Value {

	private String Name ;
	private int Age ;
	private String Country ;
	
	
	public void Set_Details(String Emp_Name , int Emp_Age , String Emp_Country)
	{
		Name = Emp_Name;
		Age = Emp_Age;
		Country = Emp_Country;
		
		
	}
	
	public void Get_Details()
	{
		System.out.println("Customer Name is " + Name);
		System.out.println("Customer Age is " + Age);
		System.out.println("Customer Country  is " + Country);
	}
	
}
