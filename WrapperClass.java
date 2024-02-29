/*Write class called “Stat”, a method called calculate (String []) find below, Read the
4 values from the command line arguments and find the min, max, sum, and
average of a given numbers. [use the Wrapper class]
Class Diagram:
Program:*/
public class Stat {
 public void calculate(String[] args) 
 {
 int [] numbers = new int[4];
 if (args.length == 4) { 
 
 for (int i = 0; i < 4; i++) {
 
 numbers[i] = Integer.parseInt(args[i]);
 }
 }
 else {
 System.out.println(" provide number of valid integers.");
 return;
 } 
 
 int min = Integer.MAX_VALUE;
 int max = Integer.MIN_VALUE;
 int sum = 0;
 for (int num : numbers) {
 if (num < min) {
 min = num;
 }
 if (num > max) {
 max = num;
 }
 sum += num;
 }
 double average = (double) sum / 4;
 
 System.out.println("Minimum Number: " + min);
 System.out.println("Maximum Number: " + max);
 System.out.println("Sum of Numbers: " + sum);
 System.out.println("Average of Numbers: " + average);
 }
 
 public static void main(String[] args) {
 Stat stat = new Stat();
 stat.calculate(args);
 }}
