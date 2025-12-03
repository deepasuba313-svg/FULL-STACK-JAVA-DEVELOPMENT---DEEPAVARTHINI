import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class Average 
{
public static void main(String args[])
	{
	String line,name,roll;
	int  mark=0,n,total=0;
	double avg=0.0;
	Scanner ip=new Scanner(System.in);
	System.out.println("-----Caluculating average mark of the student-----");
	System.out.println("Enter the name: ");
	name=ip.next();
	System.out.println("Enter Roll number: ");
	roll=ip.next();
	System.out.println("Enter total number number of subjects: ");
	n=ip.nextInt();
	for (int i=1;i<=n;i++) 
	 	{
		System.out.println("Enter the subject marks "+i+":");
		mark=ip.nextInt();	
		total=total+mark;
		avg=total/n;
	 	}
	
	try 
		{
		FileWriter fw=new FileWriter("C:\\Users\\subad\\OneDrive\\Desktop\\FULL STACK JAVA DEVELOPMENT\\Java\\Sample.txt",true);
		fw.write("Name of the student: "+name);
		fw.write("\nRegister number of the student: "+roll);;
		fw.write("\nNumber of subjects: "+n);
		fw.write("\nTotal marks obtained: "+total);
		fw.write("\nAverage: "+avg);
		fw.write("\n\n");
		fw.close();
		
		System.out.println("----------------File Content----------------");
		BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\subad\\OneDrive\\Desktop\\FULL STACK JAVA DEVELOPMENT\\Java\\Sample.txt"));
		while((line=reader.readLine())!=null)			
			System.out.println(line);
		reader.close();
		}
	
	catch(IOException e) {
		System.out.println(e.getMessage());
	}
	ip.close();
	}
}
