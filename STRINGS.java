//To find length of a string
public class Main {
  public static void main(String[] args) {
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println(txt.length());
  }
}
//Output:26
//The charAt() method returns the character at the specified index in a string
public class Main {
  public static void main(String[] args) {
    String myStr = "Hello";
    char result = myStr.charAt(0);
    System.out.println(result);
  }
}
//Output:H
//he codePointAt() method returns the Unicode(ASCII in C) value of the character at the specified index in a string
public class Main {
  public static void main(String[] args) {
    String myStr = "Hello";
    int result = myStr.codePointAt(0);
    System.out.println(result);
  }
}
//Output:72
//The codePointBefore() method returns the Unicode value of the character before the specified index in a string.
public class Main {
  public static void main(String[] args) {
    String myStr = "Hello";
    int result = myStr.codePointBefore(1);
    System.out.println(result);
  }
}
//Output:72
//The compareTo() method compares two strings lexicographically.
//The comparison is based on the Unicode value of each character in the strings.
//The method returns 0 if the string is equal to the other string. A value less than 0 is
//returned if the string is less than the other string (less characters) and a value greater
//than 0 if the string is greater than the other string (more characters).
public class Main {
  public static void main(String[] args) {
    String myStr1 = "Hello";
    String myStr2 = "Hello";
    System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal
  }
}
//Output:0
//The compareToIgnoreCase() method compares two strings lexicographically, ignoring lower case and upper case differences.
public class Main {
  public static void main(String[] args) {
    String myStr1 = "HELLO";
    String myStr2 = "hello";
    System.out.println(myStr1.compareToIgnoreCase(myStr2));
  }
}
//Output:0
//The concat() method appends (concatenate) a string to the end of another string.
public class Main {
  public static void main(String[] args) {
    String firstName = "John ";
    String lastName = "Doe";
    System.out.println(firstName.concat(lastName));
  }
}
//Output:JohnDoe
//he contains() method checks whether a string contains a sequence of characters.
//Returns true if the characters exist and false if not.
public class Main {
  public static void main(String[] args) {
    String myStr = "Hello";
    System.out.println(myStr.contains("Hel"));
    System.out.println(myStr.contains("e"));
    System.out.println(myStr.contains("Hi"));
  }
}
//The contentEquals() method searches a string to find out if it contains the exact same sequence of characters in the specified string or StringBuffer.
//Returns true if the characters exist and false if not.
public class Main {
  public static void main(String[] args) {
    String myStr = "Hello";
    System.out.println(myStr.contentEquals("Hello"));
    System.out.println(myStr.contentEquals("e"));
    System.out.println(myStr.contentEquals("Hi"));
  }
}
//The copyValueOf() method returns a String that represents the characters of a char array.
//This method returns a new String array and copies the characters into it.
//Syntax:public static String copyValueOf(char[] data, int offset, int  count)
public class Main {
  public static void main(String[] args) {
    char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
    String myStr2 = "";
    myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
    System.out.println("Returned String: " + myStr2);  
  }
}
//OUTPUT:Returned String: Hello
















