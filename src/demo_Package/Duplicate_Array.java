package demo_Package;
public class Duplicate_Array 
{
public static void main(String[] args) 
   {
	int a[]= {1,2,2,4,5,6,4,8,8,3,3};
	int count=0,i;
	System.out.println("DUPLICATE NUMBERS ARE:" );
	for(i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				
				System.out.println(a[j]);
				count++;
			}
			
		}
		
	}
	 
  	
   
      System.out.println("TOTAL DUPLICATE NUMBERS ARE:"+count);
   
}
}
