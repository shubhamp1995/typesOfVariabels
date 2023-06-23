package localandglobal;

public class demo4 {
int a=400;

public static void main(String[] args) {
	
	demo4 d1=new demo4();
	System.out.println(d1.a);
	d1.y2();
	System.out.println("----------------------------");
	demo5 ab=new demo5();
	System.out.println(ab.b);
	y1();
}
public static void y1() 
{
demo4 d2=new demo4();
System.out.println(d2.a);

}
public void y2() {
	System.out.println(a);
}
}
