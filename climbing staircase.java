package practice;
import java.util.Scanner;
class Fibonacci{
	void climbing(int n) {
		int a,b,c=0;
		a=0;
		b=1;
		while(c<=n) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
	}
}
public class ClimbingStaircase {
public static void main(String args[]) {
	int n;
System.out.println("Enter n");
Scanner x=new Scanner(System.in);
n=x.nextInt();
Fibonacci obj=new Fibonacci();
obj.climbing(n);
}
}

