package demo_Package;
public class Static_Array 
{
	static int a[]= {1,2,3,4,5};//static variable
	char ch[]= {'A','B','C','D'};//nonstatic variable
	static void show()//static method
	{
		System.out.println("calling static method");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		System.out.println();
		/*for(int i=0;i<ch.length;i++)//NOT POSSIBLE TO CALL NONOSTATIC VAR
		{
		System.out.print(ch[i]+" ");
		}*/
		//Static_Array s=new Static_Array();//obj for nonstatic variable
		//s.shownst();//calling non-static method
	}
	 void shownst()//nonstatic method
	{
		System.out.println("calling non static method");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<ch.length;i++)//non-static variable
		{
		System.out.print(ch[i]+" ");
		}
		System.out.println();
		show();//calling static method in non-satic method
	}
public static void main(String[] args) 
{
	//show();//calling static method
	//System.out.println();
    Static_Array s=new Static_Array();//cannot call nonsatic method in satic method this way
    s.shownst();//calling non static method
}

}
