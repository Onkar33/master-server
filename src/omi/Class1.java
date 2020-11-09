package omi;



public class Class1 {
	public int a=10;

    int b=15;
    private int c= 30;
     protected int d= 25;
public void publictest1 ()
     {
	   System.out.println("Public static method of class 1"); 
     }
 void defulttest1() 
    {
	 System.out.println("Default static method of class 1");
   }
private void privatetest1()
   {
	 System.out.println("Private static method of class 1");
   }
protected void protectedtest1() 
   {
	System.out.println("Protected static method of class 1");
   }
   public static void main(String[] args) 
   {
	   Class1 z= new Class1();
	   System.out .println(z.a);
	   System.out .println(z.b);
	   System.out .println(z.c);
	   System.out .println(z.d);
	   z.publictest1();
	   z.defulttest1();   
	   z.privatetest1();
	   z.protectedtest1();
	   
	   
   }
}

