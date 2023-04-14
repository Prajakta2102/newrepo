package demo_Package;
public class Premitive_Datatype 
{
	public static void main(String args [])
	{
		//1 byte=8bit                              //size
		byte b=127;                                //1 byte 
		short s=32765;                              //2byte(2*8=16bit)
	    int i=20;                                    //4byte
		long lg= 922337203685477580L;                   //8byte
		float f=410567567565656565666.235f;                           //4byte
		double dl=4123137588.5637777;                    //8byte
		boolean bool=true;                           //1bit
		char ch='d'; //2byte
		//lg=Long.SIZE;//size of datatype gives in bit
		//ch=Character.SIZE;//size of datatype in bits
		f=Float.SIZE;//size of datatype//Float is a wrapper class.//size gives in bits
		dl=(Double.SIZE)/8;//size of datatype gives in bytes.
		 //s=Short.SIZE;
		//b=Byte.SIZE;
		//i=(Integer.SIZE)/8;//gives size of datatype/ variable value in bytes.when we divide by 8 bit then it gives size in byte.
	     // 1.wrapper class means conversion of primitives datatype to obj/corresponding wrapper class(mechanism called  autoboxing) and viceversa(unboxing).
		  //  2. 8 types of wrapper class in java.lang.package called wrapper class.
		//3.java is ool . everything is an obj.it support call by value only.if we pass primitive values ,it will not change original value.
		//bt if we convert the primitive val in an obj,it will change the original value.
	     Integer wr=i;//<-example..(creating obj of wrapper class integer n passing the value to the obj)
	    wr=90;//n we change the value 
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(lg);
		System.out.println(f);
		System.out.println(dl);
		System.out.println(bool);
		System.out.println(ch);
		System.out.println(wr);
		
	}

}
