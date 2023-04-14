package demo_Package;
public class Two_DArray 
{
   public static void main(String[]args)
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		//System.out.println("UPDATED VALUE");
	/*	a[1][1]=45;
		System.out.println("a[1][1]:"+a[1][1]);
		System.out.println("AFTER UPDATION");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}*/
	}

}
