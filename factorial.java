package practice;
	public class stat {
			static int n=5;
			public static void main(String[] args) {
			System.out.println("factorial is" +FactorialMethodClassLvlModularization.factorial());
			}
	}
	class FactorialMethodClassLvlModularization {
			static int r=stat.n;
			static int x=1;
			static int factorial() {
				while(r>1) {
					
					x=x*r;
					r=r-1;
				}
				return x;
			}
		}
