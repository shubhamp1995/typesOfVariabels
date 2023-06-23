package LandG2;

public class demo4 {
int a=20;
public static void main(String[] args) {
	demo4 d5=new demo4();
	System.out.println(d5.a);
	d5.g1();
	demo5 d8=new demo5();
	System.out.println(d8.h);
	
	g2();
	
}
public static void g2() 
{
	demo4 d6=new demo4();
	System.out.println(d6.a);
	demo5 d7=new demo5();
	System.out.println(d7.h);
}
public void g1() 
{
   demo5 n1=new demo5();
   System.out.println(n1.h);
	System.out.println(a);
}
}
