package practice;
import java.util.Scanner;
class cuboids{
	public void volume(int l,int b,int h) {
		System.out.println(l*b*h);
	}
}
class rectangles extends cuboids{
	public void area(int l,int b) {
		System.out.println(l*b);
	}
}
class square extends rectangles{
	public void areaSquare(int l) {
		System.out.println(l*l);
	}
}
public class multilevelinheritance {
public static void main(String args[]) {
	Scanner x=new Scanner(System.in);
	int l,b,h;
	l=x.nextInt();
	b=x.nextInt();
	h=x.nextInt();
	square obj=new square();
	obj.area(l, b);
	obj.volume(l, b, h);
	obj.areaSquare(l);
}
}
