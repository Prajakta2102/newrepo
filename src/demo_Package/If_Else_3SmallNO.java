package demo_Package;
public class If_Else_3SmallNO
{
 public static void main(String[]args)
  {
	 int a=10,b=9,c=30;
	 if(a<b)
	 {
		 if(a<c)
		  {
			 System.out.println(a+ " is smaller");
		  }
		 else
		  {
			 System.out.println(c+ " is smaller");
		  }
	 }
	 else
	 {
		 if(b<c)
		  {
			 System.out.println(b+ " is smaller");
		  }
		 else
		  {
			 System.out.println(c+ " is smaller"); 
		  }
	 }
  }
}
