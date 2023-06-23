package localandglobal;

public class this_super_keyword extends super_class
{
int a=10;

public void m1() {
	int a=20;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
}
public static void main(String[] args) {
	this_super_keyword tsk=new this_super_keyword();
	tsk.m1();
}
}
