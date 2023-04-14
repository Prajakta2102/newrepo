package demo_Package;
public class Practice_NestedFor_Pattern 
{
public static void main(String[] args)
{
	//1.pattern program
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				if(j!=i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print("*");
				}
				
			}
			System.out.println(" ");
		}
		System.out.println(" ------------------------------------------------------");  
	//2.pattern program
	 for(int i=1;i<=10;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print(i*j +" ");
		 }
		 System.out.println();
	 }
	 System.out.println(" ------------------------------------------------------");
	//3.pattern program
	
	 for(int i=0;i<=5;i++)
	 {
		 for(int j=0;j<=i;j++)
		 {
			 System.out.print(" "+(char)(97 + i));//65- for asci value of A.97- for a
		 }		 
		 System.out.println(" ");
	 }
	 System.out.println(" ------------------------------------------------------");
	 //4.pattern program
	for(int i=5;i>0;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);	
		}
		System.out.println("");
	}
	System.out.println(" ------------------------------------------------------");
	//5.pattern program
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>i;j--)
		{
			System.out.print("* ");	
		}
		System.out.println("");
	}
	System.out.println(" ------------------------------------------------------");
	//6.pattern program
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j + " ");	
		}
		System.out.println("");
	}
	System.out.println(" ------------------------------------------------------");
	
}

}

