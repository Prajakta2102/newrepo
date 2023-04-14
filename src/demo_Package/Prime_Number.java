package demo_Package;
public class Prime_Number
{
public static void main(String[] args) 
{
	int total=0;
	int sum=0;
	
	for(int i=2;i<=10;i++)//loop for checking no
	{
		int count=0;
		
		for(int j=1;j<=i;j++)//loop for dividing number 0 and itself
		{
			//2
			if(i%j==0)//2%1
			{
				count++;//1
			}
		}
		if(count==2)
		{
			System.out.println(i);
			
			sum=sum+i;//sum of prime number
			total++;//total no of prime no
		}
		
	}
	System.out.println("the total prime no :" +total);
	System.out.println("the sum of prime no :" +sum);

}

}
