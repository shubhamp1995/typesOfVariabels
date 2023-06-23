package LandG2;
//sub class
public class THIS_SUPER extends aa

//int a=100;  
{
int a=30;

public void y1() {
	int a=20;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
	
}
public static void main(String[] args) {
	THIS_SUPER ths =new THIS_SUPER();
	ths.y1();
	System.out.println(ths.a);
	System.out.println();
	
}
}
