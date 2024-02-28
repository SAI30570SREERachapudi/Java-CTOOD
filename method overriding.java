package practice;
class Shape{
	public void car() {
		System.out.println("Hello Parent");
	}
}
class circle extends Shape{
	public void car() {
		System.out.println("Hello child");
	}
}
public class Method_Overriding {
public static void main(String args[]) {
	circle x=new circle();
	x.car();
}
}
