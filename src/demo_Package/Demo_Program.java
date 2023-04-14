package demo_Package;
public class Demo_Program 
{
 public static void main(String args[])
	{
	 
	// Assignment 3.Que1.//
	/* 
     *
	 **
	 ***
	 ****
	 *****
	 ******
	 *******
	 ******
	 *****
	 ****
	 ***
	 **
	 *
*/
	 for(int i=1;i<=7;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 for(int i=1;i<=6;i++)
	 {
		 for(int j=6;j>=i;j--)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 
	 System.out.println("______________________________________"); 
	 
	// Que2:- 
/*	  *
     **
    ***
   ****
  *****
 ******
*******
 ******
  *****
   ****
    ***
     **
      *
       
	 */
	 for(int i=1;i<=7;i++)
	 {
		 for(int k=7;k>i;k--)// for(int k=6;k>=i;k--)
		 {
			System.out.print(" "); 
			 
		 }
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print("*");  
		 } 
		 System.out.println();
		 
	 }
	 for(int i=1;i<=7;i++)
	 {
		 for(int k=1;k<=i;k++)
		 {
			System.out.print(" "); 
		 }
		 for(int j=6;j>=i;j--)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	
	 System.out.println("______________________________________"); 
	//que3://Diamond shape
/*	  * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
* * * * * * * 
 * * * * * * 
  * * * * * 
   * * * * 
    * * * 
     * * 
      *       */
   //combining logic of equilateral triangle with logic of water-image of  equilateral triangle
	   
        
      for(int i=1;i<=7;i++)// logic of equilateral triangle
       {  
    	   for(int k=7;k>i;k-- )
    	   {
    		   System.out.print(" "); 
    	   }
    	   for(int j=1;j<=i;j++)
    	   {  
    		   System.out.print("* "); 
    	   }
    	 System.out.println();  
       }
	   for(int i=1;i<=7;i++)//logic of water-image of  equilateral triangle
	   {
		   for(int k=1;k<=i;k++ )
		   {
			   System.out.print(" ");
			   
		   }
		   for(int j=7;j>i;j--)
		   {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }

	   System.out.println("______________________________________"); 
	 	
	  
	 
/*	    *
	   ***
	  *****
	 *******
	*********  */

	 for(int i=1;i<=5;i++)////logic of odd piramid
	 {
		for(int k=5;k>i;k--)//add logic of 2st quad right angle traingle
		{
		 System.out.print(" ");	
		}
		/*for(int p=1;p<i;p++)
		{
			System.out.print("*");
		}*/
		for(int l=1;l<=(2*i-1);l++)//add logic of 1st quad right angle traingle
			
		{
			System.out.print("*");
		}
		System.out.println();
		}
 System.out.println("______________________________________");
	
	 //**************************water image of odd piramid******************
	 for(int i=5;i>=1;i--)
	 {
		 for(int k=5;k>=i;k--)
		 {
			 System.out.print(" "); 
		 }
		/*for(int p=5;p>i;p--)
		 {
			 System.out.print("*"); 
		 }*/
		
		 for(int l=1;l<=(2*i-1);l++)                                                          
		 {
			 System.out.print("*"); 
		 }
		 
		 System.out.println(); 
		 
	 }
	 System.out.println("______________________________________");
	
	 //*********************to print 2nd and 4th quadrant ( rombus(right)************************************
	 for(int i=1;i<=5;i++)
	 {
		 for(int k=5;k>i;k--)
		 {
			 System.out.print(" ");  
		 }
		 
		 for(int p=1;p<=5;p++)
		 {
			 
			 System.out.print("*"); 
		 }
		 System.out.println(); 
	 }
	 System.out.println("_____________________________");
	//2.to print 1st and 3rd quadrant rombus(left)
	 
	 for(int i=1;i<=5;i++)
	 {
		 for(int k=1;k<i;k++)
		 {
			 System.out.print(" ");  
		 }
		 for(int k=1;k<=5;k++)
		 {
			 System.out.print("*"); 
			 
		 }
		 System.out.println();  
	 }
	 
	  System.out.println("_____________________________");
		//3.to print 1nd quadrant hollow rombus
	 
       for(int i=1;i<=6;i++)
       {
    	    for(int k=6;k>i;k--)
    	   {
    		   System.out.print(" ");
    	   }
    	   
    	   for(int l=1 ;l<=6;l++)
    	   {
    		   if((l==1)||(l==6))//cond to print 1st n last star 
    		   {
    		   System.out.print("*");
    		   }
    		   else if ((i==1||i==6))//cond to print star on 1st n last line  
    	       {
    		   System.out.print("*");
    		   }
    		   else
    		   {
    			   System.out.print(" ");//cond to print space   
    		   }
    	   }
    	   System.out.println();
       }
       System.out.println("_____________________________");
      
       //hollow rectangle
       for(int i=1;i<=4;i++)
       {
    	   for(int k=1;k<=4;k++)
    	   {
    		   if((i==1)||(i==4)) 
    		   {
    		   System.out.print("*");
    		   }
    		   else if((k==1)||(k==4))
    		   {
    			   
    	        System.out.print("*"); //(char)(65+i)for print alphabet
    	        
    	       }
    		   else
    		   {
    			   System.out.print(" "); 
    		   }
    		  
    	   }
    	   System.out.println();
       }
       System.out.println("_____________________________________________________");
       //hollow right angle traigle
       for(int i=1;i<=5;i++)
       {
    	   for(int k=5;k>i;k--)
    	   {
    		   System.out.print(" ");  
    	   }
    	   for(int p=1;p<=i;p++)
    	   {
    		   if((i==1)||(i==5)||(p==1)||(p==i))
    		   {
    			   System.out.print("*"); 
    		   }
    		  else
    		   {
    			   System.out.print(" ");
    		   }
    		   
    	   }
    	   System.out.println();
       }
       System.out.println("_____________________________________________________"); 
       for(int i=1;i<=5;i++)
       {
    	   for(int j=1;j<=i;j++)
    	   {
    		   System.out.print(j);  
    	   }
    	   System.out.println();
       }
       for(int i=1;i<=5;i++)
       {
    	   for(int j=5;j>i;j--)
    	   {
    		   System.out.print(j);  
    	   }
    	   System.out.println();
       }
       System.out.println("_____________________________________________________");
       for(int i=1;i<=5;i++)
       {
    	   for(int k=5;k>i;k--)
    	   {
    		   System.out.print(" ");
    	   }
    	   for(int j=1;j<i;j++)
    	   {
    		   System.out.print((char)(64+i)+" ");
    	   }
    	   System.out.println(); 
       }
       for(int i=1;i<=5;i++)
       {
    	   for(int k=1;k<i;k++)
    	   {
    		   System.out.print(" "); 
    	   }
    	   for(int j=5;j>=i;j--)
    	   {
    		   System.out.print((char)(64+j)+" "); 
    	   }
    	   
    	   System.out.println();
       }
       System.out.println("_____________________________________________________");
    
       for(int i=1;i<=7;i++)
       {
    	   for(int j=7;j>i;j--)
    	   {
    		   System.out.print(" ");  
    	   }
    	   
    	   for(int j=1;j<=7;j++)
    	   {
    		   System.out.print((char)(64+j)+" ");  
    	   }
    	   System.out.println();  
       }
       for(int i=1;i<=7;i++)
       {
    	   for(int j=1;j<=i;j++)
    	   {
    		   System.out.print(" ");  
    	   }
    	   
    	   for(int j=7;j>=1;j--)
    	   {
    		   System.out.print((char)(64+j)+" ");  
    	   }
    	   System.out.println();  
       }
	   System.out.println("_________________________________________________");
       for(int i=1;i<=5;i++)
       {
    	   for(int j=1;j<=i;j++)
    	   {
    		   System.out.print(" ");  
    	   }
    	   
    	   for(int j=7;j>=2*i-1;j--)
    	   {
    		   System.out.print(j);  
    	   }
    	   System.out.println();  
       }
 System.out.println("_____________________________________________________________________ "); 
           
         for(int i=1;i<=5;i++)
         {   
        	 for(int j=1;j<i;j++)
      	   {
      		   System.out.print(" ");  
      	   }
      	   
      	   for(int j=5;j>=1;j--)
      	   {
      		   if((j==1)||(j==5))
      		   {
      		   System.out.print(j); 
      		   }
      		   else if((i==1)||(i==5))
      		   {
      			 System.out.print(j);  
      		   }
      		   else
      		   {
      			 System.out.print(" ");  
      		   }
      	   }
        	 System.out.println(); 
         }
	
         System.out.println("----------------------");
         
         for(int i=1;i<=5;i++)
         {
        	 for(int j=1;j<=i;j++)
        	 {
        		 System.out.print(j);
             }
        	 System.out.println();
         }
         System.out.println("----------------------");
         for(int i=1;i<=5;i++)
         {
        	 for(int j=4;j>=i;j--)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
	
	}
 
 
	
	
		
	 
	 
	
	
}



 