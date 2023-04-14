package demo_Package;
public class NonStat_MetVar_Para 
{
	int d=100;//instance/non static var
	int c=500;
	public int sub(int a,int b)
	{
		int x=b-a;
		return x;
	}
public static void main(String[] args) 
{
	//local var
	NonStat_MetVar_Para n=new NonStat_MetVar_Para();
	System.out.println(n.sub(100,500));
	n.c=890;
	//System.out.println(n.c=890);//updating val of var
	System.out.println(n.c);
	System.out.println(n.sub(100,890));
}

}
