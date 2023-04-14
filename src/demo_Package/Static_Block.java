package demo_Package;
class Static_Block 
{
	static int b=8;
	static //static block
	  {
		  int a=90;
		   
		  System.out.println( "i am Static block...not static method..executed before main()!! "+a);
	  }

  public static void main(String[]args)
  {
	 
	  System.out.println("i am main method executed after static block!! " );
	  Static_Block s=new Static_Block();
	
  }
}

