package practice;
class superclass{
	int id;
	public void car() {
		System.out.println("Hello car");
	}
}
class child extends superclass{
	int id;
	public void bike() {
		super.id=45;
		super.car();
		this.id=75;
		System.out.println("ID in Parent class is: "+super.id);
		System.out.println(id);
	}
}
public class Super_Keyword {
public static void main(String args[]) {
	child obj = new child();
	obj.bike();
}
}
