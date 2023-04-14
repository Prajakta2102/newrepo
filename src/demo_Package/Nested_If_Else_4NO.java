package demo_Package;
public class Nested_If_Else_4NO 
{
   public static void main(String args[])
    {
	 int a=7,b=2000,c=7870,d=840;
	 if(a>b)
	 {
		if(a>c)
		 {
			 if(a>d)
			 {
				 System.out.println(a + " is greater");
			 }
			 else
			 {
				 System.out.println(d+ " is greater");
			 }
		 }
		 else
		 {
			 if(c>d)
			 {
			 System.out.println(c+ " is greater");
			 }
			 else
			 {
				  System.out.println(d+ " is greater");
			}
		}
	 }
	 else
	 {
		 if(b>c)
		 {
			 if(b>d) 
			 {
			 System.out.println(b+ " is greater");
			 }
			 else
			 {
				 System.out.println(d+ " is greater");
			 }
		}
		 else
		 {
			 if(c>d)
			 {
			 System.out.println(c+ " is greater");
			 }
			 else
			 {
				  System.out.println(d+ " is greater");
		     }
			}
		 }
      }
  }
