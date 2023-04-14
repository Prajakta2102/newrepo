package demo_Package;
public class Palidrome_N0 {

	public static void main(String[] args) 
	{
		int n=868,temp,rem,sum=0;
		temp=n;
		while(n>0)//same logic for reverse number
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n/=10;
		}
		if (temp==sum)
		{
			System.out.println(temp + " is a palidrome no");
		}
		else
		{
				System.out.println(temp + " is not a palidrome no");
		}
		//System.out.println(temp + "is reverse no of no "+ sum);

	}

}
