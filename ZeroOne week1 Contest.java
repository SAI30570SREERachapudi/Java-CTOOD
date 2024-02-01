//SUM OF TWO FLOATING NUMBERS AND ROUND OFF TO THREE DECIMAL PLACES
import java.util.Scanner;
public class Main{
    float a,b;
    public float Sum(float a,float b){
    float c=a+b;
    return c;
    }
    public static void main(String args[]){
        Main obj=new Main();
        Scanner x=new Scanner(System.in);
        obj.a=x.nextFloat();
        obj.b=x.nextFloat();
        float y=obj.Sum(obj.a,obj.b);
        System.out.println(String.format("%.3f",y));
    }
}
//DIGIT SUM UNTIL SINGLE DIGIT USING RECURSION
import java.util.Scanner;
public class Main{
    public void sumOfDigits(int n,int x)
    {
        int r;
        while(n>0){
            r=n%10;
            x+=r;
            n=n/10;
        }
        if(x>9){
            n=x;
            x=0;
            sumOfDigits(n,x);
        }
      else 
      System.out.println(x);
      
        
    }
    public static void main(String args[]){
        int n,sum;
        Scanner num=new Scanner(System.in);
        Main obj=new Main();
        n=num.nextInt();
       obj.sumOfDigits(n,0);
       
    }
}
//REVERSE OF A NUMBER
import java.util.Scanner;
public class Main{
    public int reverse(int n){
        int r,x=0;
        while(n>0){
            r=n%10;
            x=x*10+r;
            n=n/10;
        }
        return x;
        
    }
    public static void main(String args[]){
            int n,reversed;
            Scanner x=new Scanner(System.in);
            Main obj=new Main();
            n=x.nextInt();
            reversed=obj.reverse(n);
            System.out.println(reversed);
            
            
    }
}

