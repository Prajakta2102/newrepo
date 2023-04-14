package demo_Package;
public class Unary_Arithmatic_operator 
{
	public static void main(String[]args)
	{
		int x=5;
		//int y=x++;
		/*System.out.println("y"+" "+"="+" " + y);//postfix increment operator
		//first it will print value of x and then it will increment the value of x by 1.
		//so our o/p is x=5..then it will increment by 1.5+1=6(x=x+1)
		//now x=6.
		System.out.println("****************************");*/
		
		System.out.println("++x"+" "+"=" +" "+ ++x);//prefix increment operator
		//value of x=6
		//1st it will increment value by 1.(x=x+1)x=6+1=7 and then it will print the value.
		//output is x=7
		System.out.println("****************************");
		
		System.out.println("x--"+" "+"=" +" "+ x--);//postfix decrement operator
		//first it will print value of x and then it will decrement the value of x by 1.
		//value of x=7..
		//so our o/p is x=7..then it will decrement by 1.7-1=6(x=x-1)
		//now x=6.
		System.out.println("****************************");

		System.out.println("--x"+" "+"=" +" "+ --x);//prefix decrement operator
        //value of x=6
		//1st it will decrement value by 1.(x=x-1)x=6-1=5 and then it will print the value.
		//output is x=5
		System.out.println("****************************");
	}

}
