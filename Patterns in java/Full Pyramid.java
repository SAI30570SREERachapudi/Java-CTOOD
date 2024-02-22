public class FullPyramid {
public static void main(String arhs[]) {
	int x=4,k;
	for(int i=1;i<=5;i++) {
		for(k=1;k<=x;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		x--;
		System.out.print("\n");
	}
x=1;
	for(int i=5;i>=0;i--) {
		for(k=1;k<x;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		x++;
		System.out.print("\n");
	}
	
}}
