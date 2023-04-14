package demo_Package;
public class Nonstatic_method 
{
	int a=9;//non=static/instance variable
	static int x=76;
	public void show(int b)//non-static method
	{
		//int c=90;
		System.out.println(b);
	}
	public static void how(int a)//parameter(local var declred within static /any method)
	{
		
	System.out.println(a);	
	}
public static void main(String[] args) 
{
	
	int p=98;//local var
	 Nonstatic_method s=  new Nonstatic_method ();//create obj of class
	s.show(s.a);//calling non-static method (calling ns by ref of obj giving non-static variable	
    how(p);//static method with local variable
    s.show(p);////non static method with local variable
     //s.show(c);not possible to cl local var by using nonstatic method
     s.show(Nonstatic_method.x);//by calling nonstatic method to static var
     s.show(x);//by calling nonstatic method to static var
   how(s.a);//static method with instance variable
}   

}
