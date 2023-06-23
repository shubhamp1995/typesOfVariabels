package localandglobal;

public class Exa2 
{
 static int a=50;  // Static -> global variable
 
 public static void main(String[] args) {
//	static global variable called from same class
	 System.out.println(a);
//		static global variable called from diff class
	 System.out.println(Exa3.c);
	 x1();
	 Exa2 d2=new Exa2();
			d2.y1();
}
 public static void x1()
 {
System.out.println(a);	
 }
	public void y1() 
	{
	System.out.println(a);	
	}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
