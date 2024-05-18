package Encapulation_Tasks;

public class Employe_Value {
	
	
	public static void main(String[]args)
	{
		
		Print_Employe_Value Call_Obj = new Print_Employe_Value();
		Call_Obj.Set_Details("Vimal", 23, "India");
		Call_Obj.Get_Details();
	}
}
