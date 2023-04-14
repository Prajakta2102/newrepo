package demo_Package;
public class Largest_Smallest_NOArray 
{
	public static void main(String []args)
	{
	int a[]={7,1,4,9,8,5,4};
	int smallest=a[0],largest=a[0],i;
   
	for( i=0;i<a.length;i++)
	{
		if(largest<a[i])
		{
			largest=a[i];//largest no//
			
		}
		else if(smallest>a[i])
		{   
			smallest=a[i];
			
			
		}
	}
	System.out.println("THE LARGEST NO:"+largest);
	System.out.println("THE SMALLEST NO:"+smallest);
	
	}

}
