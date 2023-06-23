package localandglobal;

public class Exa1 
{
	 
	int a=40;      // globla variable
	public void m1() // non-static method
	{
		int b=20;   // local varibale 
	System.out.println(a);
	System.out.println(b);
	}
	public void m2() 
	{
	System.out.println(a);
	//System.out.println(b);
	}
	public static void main(String[] args) 
	{
		          // local variable
	
		Exa1 d=new Exa1();
		d.m1();
		d.m2();
		
	}
	
	
	
	
	
	
	
	
	
}