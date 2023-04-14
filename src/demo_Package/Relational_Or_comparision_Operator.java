package demo_Package;
public class Relational_Or_comparision_Operator 
{
	public static void main(String []args)
	{
		int x=20;
		int y=50;
		//result will get in boolean (true/false).
		//1.greater than(>)
		//operation will performed n compiled left to right ..so we use ">" this instead of "<")
		boolean r1=(x>y);
		System.out.println("x>y"+" "+r1);
	
		System.out.println("*************************");
		//2.less than(<)
        boolean r2=(x<y);
	    System.out.println("x<y"+" "+r2);
	    
	    System.out.println("*************************");
		//3.greater than equal to(>=)
        boolean r3=(x>=y);
	    System.out.println("x>=y"+" "+r3);
	    
	    System.out.println("*************************");
		//4.less than equal to(>=)
        boolean r4=(x<=y);
	    System.out.println("x<=y"+" "+r4);
	    
	    System.out.println("*************************");
		//5. equal to(==)
        boolean r5=(x==y);
	    System.out.println("x==y"+" "+r5);
	    
	    System.out.println("*************************");
		//6.not equal to(!=)
        boolean r6=(x!=y);
	    System.out.println("x!=y"+" "+r6);




	}

}
