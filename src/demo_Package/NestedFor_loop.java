package demo_Package;
public class NestedFor_loop
{
   public static void main(String[] args) 
	{
	   /*1.for printing 1st left quadrant right angle triangle//'|_'
	   *****
	   **** 
	   ***  
	   **   
	   *    */
	   for(int i=1;i<=4;i++)//outer loop//this loop for printing  "space "
		{
			for(int j=4;j>=i;j--)//inner loop// this loop is for printing '*'
			{
				System.out.print("*");
			}
			
		System.out.println(" ");
		}
	   System.out.println("_______________________________________________ ");
	   //******************************************************//
	   
	   //2.for printing 1st left quadrant right angle triangle//'|-'
	 /*
	     *
         **
         ***
         ****
         *****      */
         for (int i=1;i<=4;i++)//outer loop//this loop for printing  "space "
	   {
		   for(int j=1;j<=i;j++)//inner loop// this loop is for printing '*'
		   {
			   System.out.print("*");
			   
		   }
		   System.out.println();
	   }
  	   System.out.println("_______________________________________________ ");
	   
	   //******************************************************//
	   
	   //3.with "("* ") space to print square pattern
	   
	  for(int i=1;i<=4;i++)
	   {
		   for(int j=1;j<=4;j++)
		   {
			System.out.print("* ");	//with space//printing square pattern//if give "("*") without space goves rectangle. 
		   }
		   System.out.println();
	   }
	   System.out.println("_______________________________________________ "); 
	   //******************************************************//
	   
	   //4.with "("* ") space to print rectangle pattern
	   
	   for(int i=1;i<=4;i++)
	   {
		   for(int j=1;j<=6;j++)
		   {
			System.out.print("* ");	//with space//printing rectangle pattern//if give "("*") with space gives rectangle. 
		   }
		   System.out.println();
	   }
	   System.out.println("_______________________________________________ ");
	   
	   //******************************************************//
	   
	   // //5.for printing 2st right quadrant right angle triangle//'/|' 
	  /*  *
	     **
	    ***
	   *****/
	     for(int i=1;i<=4;i++)
		{
			//for(int k=3;k>=i;k--)
				for(int k=4;k>i;k--)
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++ )
			{
				System.out.print("*");
			}
				
			System.out.println();
        }
		   System.out.println("_______________________________________________ ");
	   //******************************************************//
	   
	 /*6.for printing 2st right quadrant right angle triangle mirror image  */
	   
	/*   ****
	      ***
	       **
	        *                  */
	   
	  for(int i=1;i<=4;i++)  
	   {
		   for(int k=1;k<=i;k++)
		   {
			   System.out.print(" ");
			   
		   }
		   for(int j=4;j>=i;j--)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
		   
	   }
	   System.out.println("_______________________________________________ ");
	   //******************************************************//
	   // //7.for printing  equilateral triangle//'/\' 
/*	     * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    * * * * * * 
   * * * * * * * 
  * * * * * * * * 
 * * * * * * * * * 
* * * * * * * * * * 
  */
		   for(int i=1;i<=10;i++)
			{
				for(int k=10;k>i;k--)
				{
					System.out.print(" ");
					
				}
				for(int j=1;j<=i;j++ )
				{
					System.out.print("* ");//implement 2nd quadrant Right angle triangle n give space after "* ".
				}
					
				System.out.println();
	         }
	
		   System.out.println("_______________________________________________ ");
   //******************************************************//
   
   // //8.for printing Water image of equilateral triangle//'/|' 
/*   * * * * * * * * * * 
      * * * * * * * * * 
       * * * * * * * * 
        * * * * * * * 
         * * * * * * 
          * * * * * 
           * * * * 
            * * * 
             * * 
              *                 */
  for(int i=1;i<=10;i++)
	{
		for(int k=1;k<i;k++)
		{
			System.out.print(" ");
			
		}
		for(int j=10;j>=i;j-- )
		{
			System.out.print("* ");////implement 3rd quadrant Right angle triangle n give space after "* ".
		}
			
		System.out.println();
     }
  System.out.println("_______________________________________________ ");
   //******************************************************//
  
  
}
}


