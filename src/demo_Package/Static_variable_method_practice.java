package demo_Package;
public class Static_variable_method_practice 
{
	static int a=10;//static var//declared/defined
	//class body
	static int b=40;

	public static void show()//static method defined
	{
		
		System.out.println("this is static method");
   }
 public static void main(String[] args)//main method
{
	 
    System.out.println(a);//calling static var
	System.out.println(Static_variable_method_practice.a);//calling Static_variable_method_practice varible by classname
	System.out.println(b);//calling static var
	System.out.println(Static_variable_method_practice.b);//calling Static_variable_method_practice varible by classname
	System.out.println(Static_variable_method_practice.b=90);//updating value of b
	b=80;
	System.out.println(b);
	show();
	Static_variable_method_practice.show();
	Static_variable_method_practice.show();
}
//class body
}
