package LandG2;

public class demo2 {
 static int a=10;
 public static void main(String[] args) {
	System.out.println(a);
	System.out.println(demo3.b);
	z1();
	demo2 d4=new demo2();
	d4.z2();
	
}
 
 public static void z1()
 {
System.out.println(a);
System.out.println(demo3.b);
}
 public void z2() 
 {
	 System.out.println(demo3.b);
System.out.println(a);
}
}
