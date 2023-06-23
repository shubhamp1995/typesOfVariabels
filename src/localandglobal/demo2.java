package localandglobal;

public class demo2 {
static int h=500;
public static void main(String[] args) {
	System.out.println(h);
	
	System.out.println(demo3.b);
	y1();
	demo2 abc=new demo2();
	 abc.y2();
}
public static void y1() {
	 int d=50;
	System.out.println(d);
	System.out.println(h);
}
public void y2() {
	System.out.println(h);
}
}
