package One;
public class Two {
    public static class Main {
        public static void main(String[] args) {
            float[] a = new float[args.length];
            for (int i = 0; i < 6; i++) {
                a[i] = Float.parseFloat(args[i]);
            }
            float sum = 0;
            float max = a[0];
            for (int i = 0; i < 6; i++) {
                sum =sum+a[i];
                if (a[i] > max) {
                    max = a[i]; 
                }
            }
            float average = sum / args.length;
            System.out.println("Average: " + average);
            System.out.println("Maximum: " + max);
        }
    }
}
