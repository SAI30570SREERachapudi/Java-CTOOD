package practice;

import java.util.ArrayList;

public class A11WrapperClass {
/*
* ───────────────────────────────────────────────────────────────────────
 Datatype  │	     		Range			      			  │  Size   │
─────────────────────────────────────────────────────────────────────────
  byte     │  -128		       		   127		      		  │   1     │
─────────────────────────────────────────────────────────────────────────
  Short    │  -32768	               32767		      	  │   2     │
─────────────────────────────────────────────────────────────────────────
  int      │  -2147483648              2147483647             │   4     │
─────────────────────────────────────────────────────────────────────────
  long     │  -9223372036854775808     9223372036854775807    │   8     │
─────────────────────────────────────────────────────────────────────────
  float    │  1.4E-45	               3.4028235E38	      	  │   4     │
─────────────────────────────────────────────────────────────────────────
  double   │  4.9E-324	               1.7976931348623157E308 │   8     │
─────────────────────────────────────────────────────────────────────────
  char     │  0	   		               65535	     	      │   2     │
─────────────────────────────────────────────────────────────────────────
  boolean  │  true                     false		          │   1     │
─────────────────────────────────────────────────────────────────────────
	 */
	/* byte    	->	Byte
	 * short   	->	Short
	 * int		->	Integer
	 * long		->	Long
	 * float	->	Float
	 * long		->	Long
	 * char		->	Character
	 * boolean	->	Boolean
	 */
	public static void main(String[] args) {
		byte bg = 5;
		short sg = 9;
		int ig = 10;
		long lg = 23398834803L;
		float fg = 3.1234567891234567f;
		double dg = 345.3242343241231241324344345312;
		char chg = 'I';
		boolean blg = true;
		boolean b2g = false;

/* Giving values using instances for 
 * wrapper class objects(deprecated since JAVA 9)
 * and called Boxing	
 */
		/*Integer i 		=	new Integer(10);
		Short s			= 	new Short((short) 4);
		Byte b			=	new Byte((byte) 4);
		Long ln			= 	new Long(45);
		Float f			=	new Float(23.456);
		Double d		=	new Double(245.4567);
		Character ch	=	new Character('A');
		Boolean	bl		=	new Boolean(false);*/
		/*	System.out.println(i+s+b+ln+f+d+ch);
		System.out.println("Integer Value : "+i);
		System.out.println("Short Value : "+s);
		System.out.println("Byte Value : "+b);
		System.out.println("Long Value : "+ln);
		System.out.println("Float Value : "+f);
		System.out.println("Double Value : "+d);
		System.out.println("Character Value : "+ch);
		System.out.println("Boolean Value : "+bl);*/

/*	Auto Boxing for all the Wrapper classes 
 * 		
 */		
		Integer ii 		=	10;	
		Short si		= 	4;	
		Byte bi			=	4;
		Long lni		= 	45l;
		Float fi		=	23.456f;
		Double di		=	245.4567;
		Character chi	=	'A';
		Boolean	bli		=	false;
		
		System.out.println("AB Integer Value : "+ii);
		System.out.println("AB Short Value : "+si);
		System.out.println("AB Byte Value : "+bi);
		System.out.println("AB Long Value : "+lni);
		System.out.println("AB Float Value : "+fi);
		System.out.println("AB Double Value : "+di);
		System.out.println("AB Character Value : "+chi);
		System.out.println("AB Boolean Value : "+bli);

/*	Boxing using wrapper.valueOf(primitive data type variable/value) 
 * 	for all the Wrapper classes 
* 		
*/		
		Integer i1 		=	Integer.valueOf(ig);
		Short s1		= 	Short.valueOf(sg);
		Byte b1			=	Byte.valueOf(bg);
		Long ln1		= 	Long.valueOf(lg);
		Float f1		=	Float.valueOf(fg);
		Double d1		=	Double.valueOf(dg);
		Character ch1	=	Character.valueOf(chg);
		Boolean	bl1		=	Boolean.valueOf(b2g);

		System.out.println("B Integer Value : "+i1);
		System.out.println("B Short Value : "+s1);
		System.out.println("B Byte Value : "+b1);
		System.out.println("B Long Value : "+ln1);
		System.out.println("B Float Value : "+f1);
		System.out.println("B Double Value : "+d1);
		System.out.println("B Character Value : "+ch1);
		System.out.println("B Boolean Value : "+bl1);
		
		
/*	Auto  UnBoxing for all the Wrapper classes 
* 		
*/
		int ig1 = ii;
		byte bg1 = bi;
		short sg1 = si;
		long lg1 = lni;
		float fg1 = fi;
		double dg1 = di;
		char chg1 = chi;
		boolean blg1 = bli;
		
		System.out.println("AUB Integer Value : "+ig1);
		System.out.println("AUB Short Value : "+sg1);
		System.out.println("AUB Byte Value : "+bg1);
		System.out.println("AUB Long Value : "+lg1);
		System.out.println("AUB Float Value : "+fg1);
		System.out.println("AUB Double Value : "+dg1);
		System.out.println("AUB Character Value : "+chg1);
		System.out.println("AUB Boolean Value : "+blg1);

		
/*	UnBoxing for all the Wrapper classes 
* 		
*/
		int ig2 = ii.intValue();
		byte bg2 = bi.byteValue();
		short sg2 = si.shortValue();
		long lg2 = lni.longValue();
		float fg2 = fi.floatValue();
		double dg2 = di.doubleValue();
		char chg2 = chi.charValue();
		boolean blg2 = bli.booleanValue();

		System.out.println("UB Integer Value : "+ig2);
		System.out.println("UB Short Value : "+sg2);
		System.out.println("UB Byte Value : "+bg2);
		System.out.println("UB Long Value : "+lg2);
		System.out.println("UB Float Value : "+fg2);
		System.out.println("UB Double Value : "+dg2);
		System.out.println("UB Character Value : "+chg2);
		System.out.println("UB Boolean Value : "+blg2);
		
//		ArrayList <int> al = new ArrayList<>();
		ArrayList <Integer> al = new ArrayList<>();
		al.add(234); 	//Auto boxing
		al.add(45);		//Auto boxing
		al.add(57);		//Auto boxing
		al.add(Integer.valueOf(234)); 	//Boxing
		al.add(Integer.valueOf(45));	//Boxing
		al.add(Integer.valueOf(57));	//Boxing
		
		int a1 = al.get(0);
		
		
		byte bw = 56;
		double dg3 = 10.235;
		short sg3 = (short)dg3;
		
		String str = "356";
		
		int xa = Integer.valueOf(str);
		System.out.println(str);
		
		int xa1 = Integer.parseInt(str);
		System.out.println(xa1);
	}
}
