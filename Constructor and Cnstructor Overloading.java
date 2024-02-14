package practice;

class Constructs {
public Constructs() {
	this(10);
	System.out.println(10+20);
}
public Constructs(int a) {
	this(10,20);
	System.out.println(a+50);
}
public Constructs(int a,int b) {
	System.out.println(a+b);
}
}
public class construct{
	public static void main(String args[]) {
		Constructs x=new Constructs();
		Constructs y=new Constructs(10,20);
		Constructs z=new Constructs(50);
	}
}
