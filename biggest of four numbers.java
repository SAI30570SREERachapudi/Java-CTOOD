import java.util.Scanner;
public class BiggestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter the fourth number: ");
        int num4 = scanner.nextInt();
        int biggestNumber = Math.max(Math.max(num1, num2), Math.max(num3, num4));        System.out.println("The biggest number is: " + biggestNumber);
scanner.close();
    }
}

