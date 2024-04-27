package mid2;

public class CheckedMain {
public static void main(String args[])throws ClassNotFoundException{
	
	StringBuffer sb = new StringBuffer("Your lowercase string");
	for (int i = 0; i < sb.length(); i++) {
	    char c = sb.charAt(i);
	    sb.setCharAt(i, Character.toUpperCase(c));
	}
	System.out.println(sb);
}
}
