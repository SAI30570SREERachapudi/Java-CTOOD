import java.util.Scanner;
import One_four.Four;
public class FourMain {	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 Four obj=new Four();
		 System.out.println("enter couse code");
		while(obj.setCode(sc.next())==false) {
			System.out.println("Enter valid course code");	
		}
		System.out.println("enter couse titile");
		obj.setCourse(sc.next());
		System.out.println("enter couse credits");
		obj.setcredits(sc.nextInt());
			 System.out.println(obj);
	}
}
