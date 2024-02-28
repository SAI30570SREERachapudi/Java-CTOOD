public class Main {      
    public static void main(String[] args) {  
        String str1 = "Hello";
        String str2 = "123abc";
        
        boolean isAlphabetic1 = isStringAlphabetic(str1);
        boolean isAlphabetic2 = isStringAlphabetic(str2);

        System.out.println("Is str1 entirely alphabetic? " + isAlphabetic1);  // Output: true
        System.out.println("Is str2 entirely alphabetic? " + isAlphabetic2);  // Output: false
    }

    private static boolean isStringAlphabetic(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;  // If any non-alphabetic character is found, return false
            }
        }
        return true;  // If all characters are alphabetic, return true
    }
}
