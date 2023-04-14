package demo_Package;
public class Armstrong_No 
{
  public static void main(String[]args)
  {
	  // 153=(1*1*1)+(5*5*5)+(3*3*3)=153//logic of armstrong no..addition of  cube of each digit
	  int n=153,rem,sum=0;
	  int i=n;
	    while(n>0)//t/t/t/f
	  {
		  rem=n%10;//153%10=3/5/1
		  sum+=(rem*rem*rem);//(3*3*3)+(5*5*5)+(1*1*1)=27+0=27+125=152+1=153
		  n/=10;//153/10=15//15/10=1//1/10=0
		  
	  }
	  if(i==sum)
	  {
		  System.out.println(i + " no is  a armstrong no");
	  }
	  else
	  {
		  System.out.println(i + " is not armstrong no");
	  }
  }

	  
	  
	 
	  
	  
	  
	  
	//counting no of armstrong no  
  {  
	  int i=1,j,rem,sum,count=0;
	
	 while(i<500)
	  //
	 {
		 int n;
		 n=i;//storing original val to different variable.bcz we are performing operation
		sum=0;
		 while(n>0)//armstrong no logic//153
		  {
		  rem=n%10;//
		  sum+=rem*rem*rem;
		  n/=10;
		  }
		  if(sum==i)
		  {
			  System.out.println( i );
			 count++;
		  }
	        i++;
		 
	  }
	 System.out.println("total no 0f arm no are: " +count ); 
	  
  }
}
