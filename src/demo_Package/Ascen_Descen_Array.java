package demo_Package;
public class Ascen_Descen_Array 
{
public static void main(String[] args) 
{
 int a[]= {4,2,6,1};
 int x;
 System.out.println("ORIGINAL ARRAY");
 for(int i=0;i<=a.length-1;i++)
 {
	 System.out.print(a[i]+" "); 
 }
 System.out.println();
 System.out.println("ASCENDING OREDER");
  for(int i=0;i<a.length;i++)//traverse
  {
	  for(int j=i+1;j<=a.length-1;j++)
	  {
		  if(a[i]>a[j])
		  {
			  x=a[i];
			  a[i]=a[j];
			  a[j]=x;
		  }
	  }
	  System.out.print(a[i]+" ");
  }
  System.out.println();
  System.out.println("DESCENDING OREDER");
  for(int i=0;i<a.length;i++)//traverse
  {
	  for(int j=i+1;j<=a.length-1;j++)
	  {
		  if(a[i]<a[j])
		  {
			  x=a[i];
			  a[i]=a[j];
			  a[j]=x;
		  }
	  }
	  System.out.print(a[i]+" ");
  }
	    

}

}
