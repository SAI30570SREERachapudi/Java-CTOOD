import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner y=new Scanner(System.in);
    int n,i,j;
    n=y.nextInt();
    int[] a=new int[n];
    for(i=0;i<n;i++){
      a[i]=y.nextInt();
    }
    for(i=0;i<a.length/2;i++){
      int temp=a[i];
      a[i]=a[n-i-1];
      a[n-i-1]=temp;
    }
    System.out.print("Reversed array: "+Arrays.toString(a));
  }}
