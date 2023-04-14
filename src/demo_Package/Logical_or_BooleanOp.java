package demo_Package;
public class Logical_or_BooleanOp 
{
   public static void main(String[]args)
   {
	   
	   //1.&&(and) operator
	   // it return 'true' value when both values are 'true'..if any one of d value is 'false',return value is 'false'.
	 boolean x1=true;
	 boolean x2=false;
	 boolean result1=(x1&&x2);
	  System.out.println(result1);
	
	  //2.||(or)operator
	  // it return 'false' value when both values are 'false'..if any one of d value is 'true',return value is 'true'.
	  boolean x3=true;
	  boolean x4=false;
	  boolean result2=(x3||x4);
		System.out.println(result2);
		
     //3.!(not)operator
	 // it operate on 1 variable only..if value is 'true',return 'false'..or viceversa..
	 boolean x5=true;
	 boolean result3=!(x5);
	  System.out.println(result3);
   }
}
