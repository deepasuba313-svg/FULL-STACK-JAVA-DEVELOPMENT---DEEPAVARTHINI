import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class SAMPLE {
public static void main(String args[]) 
	{
	try {
	String s;
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter string: ");
	s=ip.next();
	FileWriter writer= new FileWriter("C:\\Users\\subad\\OneDrive\\Desktop\\FULL STACK JAVA DEVELOPMENT\\Java\\Sample.txt");
	writer.write(s);
	writer.close();
	
	BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\subad\\OneDrive\\Desktop\\FULL STACK JAVA DEVELOPMENT\\Java\\Sample.txt"));
	String line;
	while((line= reader.readLine())!=null)
		System.out.println(line);
	reader.close();
		}
	catch(IOException e) {
		System.out.println(e.getMessage());
	}
	}
	
}
