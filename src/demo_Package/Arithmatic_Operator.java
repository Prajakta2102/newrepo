package demo_Package;
public class Arithmatic_Operator 
{
  public static void main(String args[])
  {
	  //1 Addition
	int a=7;
	int b=3;
   int c=a+b;
	  System.out.println(c);
	  
	  //2 substraction
	  int d=7,e=2;
	  int x=d-e;
	  System.out.println(x);
	   
	  //3 multiplication
	  int s=2,u=3,i;
	  i=s*u;
	  System.out.println(s*u + i);
	  
	  //4 division
	float n=2,m=8;
        double j= m/n;
	  System.out.println(j);// out 4.0
	  
	/*  int t=2,r=8;
         double g=r/t;
		  System.out.println(g);// output 4.0*/
	   
	float t=2.0f,r=5.1f;
   double g=r/t;
		  System.out.println(g);
	  
	  //5 modulus
	  int p=9,k=2;
	  System.out.println(p%k);
	  
	  
	  //typecating// if we want to convert higher value to lower value it is called explicit typecasting
	  
	double x1 =1.8,x2= 2;
	double y=x1*x2;
	int w = (int)y;//typecast of y ,double to int
	  System.out.println(w);
	  
	  double s1=457777585555555555.987;
	  float D=(float)s1;
	   System.out.println(D);
	  
	  
	  //convert lower value to higher value implicit typecast
	  int A=178;
	double B=A;
	System.out.println(B);
	  
  }
}
