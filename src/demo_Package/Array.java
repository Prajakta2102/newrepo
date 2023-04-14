package demo_Package;
public class Array 
{
public static void main(String[] args) 
{
	int a[]= {10,20,30,40};//creating an int-type of array//declare=intialize int a[]=int[]a (same)
	String st[]= {"india","srilanka","japan","china"," "};//string-type of array
	char[]ch= {'X','Y','Z','x','y','z'};
	double[]d= {12.24D,24.36D,48.6094D};
	
	System.out.println("1.print value of index of array");
	System.out.println(a[0]);//index start from '0',but size/length of array is 5(ele).
	System.out.println(st[4]);//china //at index 3
	System.out.println(ch[4]);//y//at index 4
	System.out.println(st[2]);//japan//index 2
	System.out.println(d[2]);//48.6094//index 2
	System.out.println(st[0]+" "+st[1]+" "+st[2]);
	System.out.println("__________________________________ ");

	ch[4]='b';//updating value in char of index 4-->to 'b' from 'y'
	d[1]=24.366D;////updating value in double of index 1-->to 24.366D from 24.36
	
	System.out.println("2.print UPDATING values of index of array");
	System.out.println(ch[4]);//b
    System.out.println(d[1]);//24.366
    System.out.println(st[3]="russia");//we can update  this as well n print
    System.out.println("__________________________________ ");
    
    System.out.println("3.print CHAR TYPE of array");
    for(int i=0;i<ch.length;i++)//same result for cond (i<=ch.length-1)
    {
    	System.out.print(ch[i] + " ");//X Y Z x b z
    }
    System.out.println();
    System.out.println("SIZE of DOUBLE TYPE  of array : "+ ch.length);
    System.out.println("__________________________________ ");
    
    System.out.println("4.print STRING TYPE of array");
    for(int i=0;i<=st.length-1;i++)//same result for cond (i<ch.length)
    {
    	System.out.print(st[i] + " ");//india srilanka japan rassia   
    }
    System.out.println();
    System.out.println("SIZE of DOUBLE TYPE  of array : "+ st.length);
    System.out.println("__________________________________ ");
    
    System.out.println("*****print DOUBLE TYPE of array and SIZE*****");
    for(int i=0;i<=d.length-1;i++)//same result for cond (i<ch.length)
    {
    	System.out.print(d[i] + " ");//india srilanka japan rassia   
    }
    System.out.println();
    System.out.println("SIZE of DOUBLE TYPE  of array : "+ d.length);
    System.out.println("__________________________________ ");
    
    
}

}
