package demo_Package;
public class Static_MetVar_Para 
{
	static int a=10;
	public static int add(int x,int y)
	{
		int z=x+y;
		return  z;
	}
  public static void main(String[] args) 
{
	int b=80;
	add(10,80);
	System.out.println(add(10,80));
	Static_MetVar_Para.a=100;
	System.out.println(add(a,b));//passing parameter(variable name) in method
}

}
