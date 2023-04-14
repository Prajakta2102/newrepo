package demo_Package;

public class Constructor 
{
	int a;//nonstatic var
	
	public Constructor()//constructor(without arg)(access specifer,same name as classname ,no returntype)
	//user defined constructor
	//initialised value only in without parameter for giving value to the
	//nonstatic variable
	{
		
		a=90;
				
	}
	public Constructor(int x)//constructor( with arg)/prameterised//
	//in bracket arg must be different different
	{
		//giving arg in baracket bcz we hv to intialized nonstatic variable 
		a=20;//intialised value
		
	}

	public static void main(String[] args) 
{
		Constructor s=new Constructor();//obj create//
		System.out.println(s.a);
		
		System.out.println("_________________________________________");
		
		Constructor c=new Constructor(10);
	    System.out.println(c.a);
		  c.a=30;
		 new Constructor();//without arg constructor call
		 new Constructor(100);//with arg constructor call
		// System.out.println(c.a);
		 
}

}
