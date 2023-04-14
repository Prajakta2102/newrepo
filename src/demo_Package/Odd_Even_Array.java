package demo_Package;
public class Odd_Even_Array 
{
public static void main(String[] args) 
{
	int a[]= {1,2,3,4,54,3,2,1198,35};
	System.out.println("EVEN NO ARE:");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
		
	}
	System.out.println("_____________________");
	System.out.println("ODD NO ARE:");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2!=0)
		{
			System.out.println(a[i]);
		}
		
	}

}

}
