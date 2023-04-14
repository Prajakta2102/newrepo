package demo_Package;
public class PracticeStatic 
{
	static int a[]= {1,2,3,4,5};
	static void show()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("this is static method");
		
	}
	  void nonshow()
	{
		  //show();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("this is non-static method");
		//show();//static
	}
public static void main(String[] args) 
{
	PracticeStatic s=new PracticeStatic();
	s.nonshow();//nonstatic
	//show();
}

}
