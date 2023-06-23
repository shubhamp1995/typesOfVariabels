package localandglobal;

public class super_this extends super_class
{
//	int a=100;
	int a=20;
	
	public void m1() 
	{
	int a=30;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
	}
	public static void main(String[] args) {
		super_this n=new super_this();
		n.m1();
	}
}
