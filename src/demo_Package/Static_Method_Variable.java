package demo_Package;
public class Static_Method_Variable 
{
	/*int a=9;//instance/non-static var//copy created in memory when create obj n access by obj
	static int b=70;//static var//permnant place create in main memory
	public static void show(int a)//parameter(local var declred within static /any method)
	{
	System.out.println(b);	
	}
    public static void main(String[] args)
   {
    	Static_Method_Variable s=new Static_Method_Variable ();//create obj of class
    	//classname obj ref=new classname();<---syntax
	show(b);//calling static method by methodname(passing the parameter)
	Static_Method_Variable.show(b);//calling static method by class name.methodname	
	show(s.a);//calling static method by giving parameter as instance or nonstatic var by using ref of obj in static method
	Static_Method_Variable.show(s.a);//calling static method by giving parameter as instance or nonstatic var by using ref of obj in static method
   //classname.methodname(obj ref .instace var)
   }*/
	int a=9;//instance/non-static var//copy created in memory when create obj n access by obj
	//define within class body
	static int b=70;//static var//permnant place create in main memory
	//defined within classbody
	public static void main(String[] args)
	{
		System.out.println(b);//calling static var
		//System.out.println(s.a);//not executed without create obj of class
		int c=90;//local var inside method
	  	Static_Method_Variable s=new Static_Method_Variable ();//create obj
		System.out.println(s.a);//calling instance or nonstatic var by using ref of obj
		
		System.out.println(c);//calling local var
	}
	
   
}
