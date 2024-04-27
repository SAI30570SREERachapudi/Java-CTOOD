package mid2;
class saisree implements Cloneable{
	int x;
	public void show() {
		System.out.println("Hii");
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class Clonablemain {
public static void main(String args[]) {
	saisree obj=new saisree();
	obj.x=5;

	try {
		saisree t;
		t=(saisree)obj.clone();
		System.out.println(t.x);
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	
	
	
}
}
