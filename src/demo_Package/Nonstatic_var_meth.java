package demo_Package;
public class Nonstatic_var_meth 
{    static int a=9;
	int p=50;//nonstatic var/instace var
	public void shownonst()//without parameter
	{
		System.out.println("i'm nonstatic method");
	}
public static void main(String[] args) 
{
	Nonstatic_var_meth s=new Nonstatic_var_meth();//obj create
	
    System.out.println(s.p);//nonsta var call with ref obj of class.
    s.v=200;//update instance variable value
    System.out.println(s.v);//printing value of instance var
    s.shownonst();/// calling nonstatic method by using nonstatic variable
    //s.shownonst(s.a);//<-- not allow parameter not given in method.
    System.out.println(s.a);//<--gives warning but execute//not good practice
    System.out.println(a);//this print variable value
   
    Nonstatic_var_meth r = new Nonstatic_var_meth();//2nd obj r create
    System.out.println(r.p);//nonsta var call with ref obj of class.
     s.a=1000;//updating static value //gives warning as accessing wid obj              
    s.p=12;//update value of instance var
    System.out.println(s.p);// calling instance var by using 1st obj
    System.out.println(r.p);//calling instance var by using 2nd obj
    System.out.println(s.a);//calling static var by using 1st obj
    System.out.println(r.a);//calling static  var by using 2st obj
}
int v=80;
}
