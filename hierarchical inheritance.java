package practice;
import java.util.Scanner;
class cuboidss{
	public void volume(int l,int b,int h) {
		System.out.println(l*b*h);
	}
}
class rectangless extends cuboidss{
	public void area(int l,int b) {
		System.out.println(l*b);
	}
}
class squares extends cuboidss{
	public void areaSquare(int l) {
		System.out.println(l*l);
	}
}
//cuboidss is the parent class. rectangless and squares are the
//children of cuboidss class.so rectangless and squares are sibling 
//classes.So they can't access properties of each other.
public class hierarchicalinheritance {
public static void main(String args[]) {
	Scanner x=new Scanner(System.in);
	int l,b,h;
	l=x.nextInt();
	b=x.nextInt();
	h=x.nextInt();
	squares obj=new squares();
	rectangless objs=new rectangless();
	objs.area(l, b);
	obj.volume(l, b, h);
	obj.areaSquare(l);
}
}
