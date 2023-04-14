package demo_Package;
public class Outer_InnerClass //outer class
{
	
	private class Inner_class
	{
	    private int a=0;
		public void show()//inner class nonstatic method
		{
			
		  System.out.println("i am inner class " +a);	
		}
	}
	void show_inner()
	{
		Inner_class in=new Inner_class();
		in.show();
	}

public static void main(String[] args) 
{
	Outer_InnerClass s=new Outer_InnerClass(); 	
    s.show_inner();
   
}

}

