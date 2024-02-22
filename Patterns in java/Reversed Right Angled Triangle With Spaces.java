public class ReversedRightAngledTriangle {
public static void main(String arhs[]) {
	int x=1,k;
	for(int i=5;i>=0;i--) {
		for(k=1;k<x;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		x+=2;
		System.out.print("\n");
	}
}
}
