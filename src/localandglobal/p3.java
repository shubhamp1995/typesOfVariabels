package localandglobal;



public class p3 {
static int a=30;

public static void m1() {
	int b=20;
	System.out.println(b);
	System.out.println(a);
	System.out.println(p4.c);
}
public void m2() {
	System.out.println(a);
	System.out.println(p4.c);
}
public static void main(String[] args) {
	System.out.println(a);
	m1();
	p3 p33=new p3();
	p33.m2();
}

}
