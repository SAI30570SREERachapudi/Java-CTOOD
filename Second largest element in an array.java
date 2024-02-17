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
    Arrays.sort(a);
    int z=a.length;
     System.out.print("Second maximu Element is: "+a[z-2]);
     }
    }
