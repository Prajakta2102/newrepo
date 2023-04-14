package demo_Package;
public class If_Else_4SmallNo
{
 public static void main(String []args)
{
	int a=100,b=90,c=30,d=89;
	if(a<b)
	{
		if(a<c)
		{
			if(a<d)
			{
				 System.out.println(a+ " is smallest");	
			}
			else
			{
				 System.out.println(d+ " is smallest");
			}
		}
		else
		{
			if(c<d)
			{
				 System.out.println(c+ " is smallest");
			}
			else
			{
				 System.out.println(d+ " is smallest");
			}
		}
	}
	else
	{
		if(b<c)
		{
			if(b<d)
			{
				 System.out.println(b+ " is smallest");
			}
			else
			{
				 System.out.println(d+ " is smallest");
			}
		}
		else
		{ 
			if(c<d)
			{
				 System.out.println(c+ " is smallest");
			}
			else
			{
				 System.out.println(d+ " is smallest");
			}
		}
	}
 }
}
