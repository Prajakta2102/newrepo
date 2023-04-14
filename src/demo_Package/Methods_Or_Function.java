package demo_Package;
public class Methods_Or_Function //class name
{//starting of class body
	//declaring method                                          

	static int X=9;//static variable 
	int p=90;//global//instace varible..defined in body of class but outside the body of method
    public static void printName( int a)//access specifier/keyword/returntype/methodname
	{ 
    
		System.out.println("i am static method");//body of method//defination of method
		System.out.println(a);
	}
    public static void sum(float a,int b)//method name start with camel case(lowercase)
    {
     float c=a+b;
      System.out.println(c);
      
    }
    public static void mul(int a,float b)
    {
    	float c=a*b;//c - local variable as its defined inside the body of method
    	System.out.println(c);
    }
    public static void getGrade(double marks)
    {
    	
    	if(marks>80)
    	{
    		System.out.println("A");
    	}
    	else if(marks>70)
    	{
    		System.out.println("B");
    	}
    	else if(marks>60)
    	{
    		System.out.println("C");
    	}
    	else if(marks>34)
    	{
    		System.out.println("D");
    	}
    	else
    	{
    		System.out.println("fail");
    	}
    }
    
   static public void main(String[]args)//main method call by jvm
   {
	 //Methods_Or_Function s = new  Methods_Or_Function();/<--creating object of class
      printName(X=7);//calling method//user defined method
	  // Methods_Or_Function.printName();//calling method by class name
	  // s.printName();//<-- this is not allowed creating obj of class n calling method by ref of obj
     float x=10.0f;
       int y=230;
      // int a=10,b=230;
      sum(x,y);//sum(10,230);//sum(a,b);
      mul(10,230);
      double A=90;
      double c=87;
      int b=88;
      oddEven(b);
      getGrade(A);
      getGrade(c);
      getGrade(X);
      primeFun(y);
      
      
   }
   
   public static void oddEven(int a)
   {
	   if(a%2==0)
	   {
		   System.out.println("even no");
	   }
	   else
	   {
		   System.out.println("odd no");
	   }
	   
   }

   public static void primeFun(int i)
   {
	   int count=0,sum=0,j;
	  
	   for(int l=2;l<=10;l++)
	   {
		   for( j=1;j<=l;j++)
		   {
			   if(l%j==0)
			   {
				   count++;
				   sum++;
				  
			   }
			  
		   }
		  
	   }
	   
	   if(count==2)
	   {
		   System.out.println("prime");
	   }
	   else
	   {
		   System.out.println("not prime"); 
	   }
	   
   }
   }

  

  //ending of class body
