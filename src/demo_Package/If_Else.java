package demo_Package;
public class If_Else 
{
	
	public static void main(String [] args)
	{
		
		
		
		Static_variable_method_practice.show();
		System.out.println(Static_variable_method_practice.a);
		
		
		Nonstatic_var_meth n=new Nonstatic_var_meth();//distributed memory by creating obj
		System.out.println(n.v);//calling nonstatic var from class Nonstatic_var_meth
		n.shownonst();
		Nonstatic_var_meth.a=890;//updating value of a
		System.out.println(Nonstatic_var_meth.a);//calling classname.static var.
		//cond is satisfied,then IF body will execute.otherwise,ELSE body will execute. 
	int x=10,y=50;
		
		if (x>y)
		{
			System.out.println("x is greater");
		}
		else
		{
			System.out.println("y is greater");
		}
	System.out.println("comparing values program");
	}
	

}
