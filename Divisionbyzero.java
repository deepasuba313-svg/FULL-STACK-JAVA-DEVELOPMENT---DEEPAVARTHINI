import java.util.*;
import java.util.Scanner.*;

public class Divisionbyzero
{
public static void main (String args[]) 
	{
	int a=100;
	int b;
	System.out.println("Enter the input value: ");
	Scanner ip=new Scanner(System.in);
	b=ip.nextInt();
	try 
		{
		 int result = 100 / b;
		 System.out.println("-----Divisible by Zero Error Program-----");
		 System.out.println("The final result after printing was : "+result);
		}
	catch(Exception e) 
		{
		System.out.println(e.getMessage());
		System.out.println("Error: Division by zero is not allowed.");
		}
	finally 
		{
		System.out.println("Program finished.");
		}
	}
}
