package demo_Package;
public class Ladder_Else_If_Grade 
{
 public static void main(String[]args)
 {
	 double marks=71.90;
	 char grade;
	 if(marks>80)
	 {
		 grade='A';//System.out.println(" A ");
	 }
	 else if(marks>70)
	 {
		 grade='B'; //System.out.println(" B ");
	 }
	 else if(marks>60)
	 {
		 grade='C';// System.out.println(" C");
	 }
	 else if(marks>=35)
	 {
		 grade='D';// System.out.println(" D ");
	 }
     else
	 {
    	 grade='F';// System.out.println(" F ");
	 }
	 System.out.println(" Your grade is :" + grade);
 }
}
