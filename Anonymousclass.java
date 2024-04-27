package mid2;
interface one{
	public void display();
}
public class AnonymousMain {
public static void main(String args[]) {
	one obj=new one() {
		public void display() {
			System.out.println("Hi Anonymous class");
		}
	};
	obj.display();
}
}
