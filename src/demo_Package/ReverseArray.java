package demo_Package;
public class ReverseArray 
{
public static void main(String[] args) 
{
	int sum=0;
	int a[]= {1,2,3,4,5,6};//{0,1,2,3,4,5}//
	for(int i =a.length-1;i>=0;i--)
	{
		System.out.println(a[i]);
		sum+=a[i];//6+5+4+3+2+1
	}
	System.out.println("the sum of ele in array :"+sum);

	a[4]=0;
	System.out.println(a[4]=0);
}

}
