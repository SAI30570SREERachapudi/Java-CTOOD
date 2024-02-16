package practice;

import java.util.Scanner;

public class Factorial {
			static int n;
			public static void main(String[] args) {
			Scanner k=new Scanner(System.in);
			n=k.nextInt();
			System.out.println("factorial is " +FactorialMethodClassLvlModularization.factorial(n));

			}
	}
	class FactorialMethodClassLvlModularization {
			static int r=Factorial.n;
			static int x=1;
			static int factorial(int r) {
				while(r>1) {
					
					x=x*r;
					r=r-1;
				}
				return x;
			}
		}
