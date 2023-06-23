package localandglobal;

public class p1 
{
	public  static void m1() {
		 p2 p11=new p2();
		 
		 System.out.println(p11.a);
	}
 public void m2() {
	 p2 p12=new p2();
	 
	 System.out.println(p12.a);
}
 
 public static void main(String[] args) {
		m1();
		p1 n1=new p1();
		n1.m2();
}
}
