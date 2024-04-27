package mid2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Filesmain {
public static void main(String args[]) throws FileNotFoundException {
	try {
		FileWriter f=new FileWriter("C:\\Users\\madhu\\OneDrive\\Desktop\\saifiles.txt");
		
		String s="sai sree is a good girl\nsai sree is a topper";
		f.write(s);
		f.close();
		FileReader r=new FileReader("C:\\Users\\madhu\\OneDrive\\Desktop\\saifiles.txt");
		int i;
		while((i=r.read())!=-1) {
			System.out.print((char)i);
		}
	} 
	catch (IOException e) {
		System.out.println("Hiii");
	}		
}
}
