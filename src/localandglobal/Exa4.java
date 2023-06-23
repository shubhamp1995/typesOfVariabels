package localandglobal;

public class Exa4 {
	 static int g=20; // Static -> global variable
	
	public void n1() // non- static method
	{
		int b=10;         // local variable-> temporary -> inside the body
	System.out.println(b);	
	}
	public void natha() 
	{
		//System.out.println(Exa5.f);// not valid

	System.out.println(Exa5.a);	// not valid
	}
public static void n2()   // static method 
{
	
System.out.println(Exa5.a);	

}
public static void main(String[] args) {  // main method 
	System.out.println(g);   // static global variable call from same class-> direct access
	
	System.out.println(Exa5.a);  // static global variable call from diff class
	
	n2();                          //static global variable call from same class-> call method
	
	Exa5 h1=new Exa5();             // object creation for diff class
       h1.z1();                 //non- static variable call from diff class
			
			Exa4 s1=new Exa4();     // object creation for same class
			s1.n1();                 //non- static variable call from same class
			s1.natha();
}
}
