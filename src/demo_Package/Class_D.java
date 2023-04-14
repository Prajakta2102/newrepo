package demo_Package;
public class Class_D 
{
	//Hierarchical inheritance
public static void main(String[] args) 
{
	Class_B x=new Class_B();//obj of subclass Class_B
	x.showA();//calling nonstatic method of Class_A(superclass) with obj of Class_B
	/*update value of var "a" of Class_A(superclass) in subclass B
	   with obj of class_B b.*/
	//System.out.println(x.a=30);
	Class_C y=new Class_C();//obj of subclass Class_C
	y.showA();//calling nonstatic method of Class_A with obj of Class_C(superclass)
}

}
