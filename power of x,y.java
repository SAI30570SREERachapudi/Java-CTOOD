package practice;
import java.util.Scanner;
public class power {
    public static void main(String args[]) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base (x):");
        x = sc.nextInt();
        System.out.println("Enter the exponent (y):");
        y = sc.nextInt();

        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;
        }

        System.out.println(x + " raised to the power of " + y + " is: " + result);
    }
}
