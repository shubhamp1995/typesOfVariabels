package LandG2;

public class demo1 
{
int a=20; // global variable
public void y1() 
{
	int b=30; // local variable 
	System.out.println(b);
	
}
	public void y2()
	{
	System.out.println(a);	
	}
	public static void main(String[] args) {
		demo1 d1=new demo1();
				d1.y1();
				d1.y2();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
