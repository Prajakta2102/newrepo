package demo_Package;
public class Demo_Stat 
{
	static int a=200;
	public static void show()
	{
		System.out.println("i am static method");
	}
	
	int x=500;
	//int b=690;
	public void shownst()
	{
		System.out.println("i am Non-static method");
	}
	
public static void main(String[] args) 
{
	

	/*System.out.println(a);
	System.out.println(Demo_Stat.a);
	show();
	Demo_Stat.show();*/
	Demo_Stat s=new Demo_Stat();
	System.out.println(s.x);
	//System.out.println(s.b);
	//s.shownst();
	//Demo_Stat d=new Demo_Stat();
	//System.out.println(d.x=100);
	//System.out.println(d.a);
	//System.out.println(s.x);
	//System.out.println(d.x);
	s.a=400;
	//System.out.println(s.a=400);
	System.out.println(s.a);
	//System.out.println(d.a);
	//d.shownst();

}

}
