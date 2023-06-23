package localandglobal;

public class demo1 
{
int x= 200;  // global variable

public void y1() 
{
	int g=100;  // local variable
	System.out.println(g);
	System.out.println(x);
}
public void y2()
{
System.out.println(x);
}
public static void main(String[] args) {
	demo1 b=new demo1();
			b.y1();
System.out.println(b.x);
			b.y2();
}

























}
