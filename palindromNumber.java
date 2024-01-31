import java.util.Scanner;
public class Main{
boolean isPalindrome(int n){
  int r,z,x=0;
  z=n;
  while(n>0){
r=n%10;
    x=x+10*r;
    n=n/10;
  }
  if(x==z)
    return true;
  else
    return false;
}
  public static void main(String[] args){
    int num;
    Scanner n=new Scanner(System.in);
    num=n.nextInt();
    Main obj=new Main();
    boolean x;
    x=obj.isPalindrome(num);
    System.out.println(x);
  }
}
