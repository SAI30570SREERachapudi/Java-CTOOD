package practice;

import java.util.Scanner;

public class Constructors {
	int x;
	public Constructors() {
		System.out.println("Hello User!!!  Let's Dive into coding");
		System.out.println("Want to Find factorial of a number,Then prompt a number");
	}
	public Constructors(int n) {
		int i;
		if(n==0||n==1)
			System.out.println("Factorial=1");
		else {
			int fact=1;
			for(i=2;i<=n;i++) {
				fact*=i;
			}
			System.out.println("Factorial of "+n+"is "+fact);
		}
	}

	public static void main(String args[]) {
		Constructors obj = new Constructors();
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		Constructors objs = new Constructors(n);
		
	}
}
