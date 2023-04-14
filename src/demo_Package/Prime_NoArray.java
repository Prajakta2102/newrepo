package demo_Package;
public class Prime_NoArray 
{
public static void main(String[] args) 
{
	int a[]= {2,7,4,3,6,9,12,13,19,54,73,93,24,53,78,45,97};
	int i,total=0;
	
	System.out.println("ORIGINAL ARRAY: ");
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
	System.out.println("_______________________________");
	
	System.out.println("PRIME NUMBER FROM ARRAY: ");
	for( i=0;i<=a.length-1;i++)//loop for checking no
	{
		int count=0;
		for(int j=1;j<=a[i];j++)//loop for diving no by 1 and no itself.
		{
			if(a[i]%j==0)
		  {
			count++;
			
		  }
		}
		if(count==2)
		{
			System.out.println(a[i]);
		    total++;
		}
		
		
	}
	System.out.println("TOTAL PRIME NUMBERS ARE:  "+total);//total prime no in array
	
	
	
	
}

}
