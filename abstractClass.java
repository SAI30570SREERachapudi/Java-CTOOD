package mid2;
interface sai{
	int f=5;	
	static void yashu() {
		System.out.println("HII");
	}
	
}

public class abstractMain implements sai {
	public static void main(String[] args) {
//		one obj=new two();
//		obj.multiply(5, 10);
//		obj.sum(5, 10);
		sai.yashu();
		
	}

}
