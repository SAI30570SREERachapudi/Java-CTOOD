import java.util.*;

public class Main {

    static void binary(int x){
        int r, y;
        r = x % 2;
        x = x / 2;
        binary(x);
        System.out.print(r);
    }

    public static void main(String[] args) {
        int x;
        Scanner y = new Scanner(System.in);
        x = y.nextInt();
        binary(x);
    }
}
