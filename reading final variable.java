package practice;
import java.util.Scanner;
class Finals{
	final int var;
	public Finals(int var) {
		this.var=var;
	}
	public final void car() {
		System.out.println("HELLO");
		System.out.println("Final value is: "+var);
	}
}
public class Final_Keyword {
public static void main(String args[]) {
	Scanner y=new Scanner(System.in);
	System.out.println("Enter the constant value");
	int var=y.nextInt();
	Finals x=new Finals(var);	
	x.car();
}
}
