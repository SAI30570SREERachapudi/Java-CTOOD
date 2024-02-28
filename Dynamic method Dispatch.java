package practice;
class shape{
	public void bike() {
		System.out.println("Hello Parent");
	}
}
class sphere extends shape{
	public void bike() {
		System.out.println("Hello child");
	}
}
class area extends sphere{
	public void bike() {
		System.out.println("Hello grandchild");
	}
}
public class Dynamic_method_dispatch {
public static void main(String args[]) {
	shape k;
	shape s=new shape();
	sphere p=new sphere();
	area a=new area();
	k=a;
	k.bike();
	k=p;
	k.bike();
	k=s;
	k.bike();
	
}
}
