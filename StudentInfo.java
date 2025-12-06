import java.util.Scanner;
import java.util.ArrayList;

public class StudentInfo 
{
public static void main(String args[])
	{
	int rollno,number,no,marks=0;
	String name;
	ArrayList<Integer> Rollno= new ArrayList<>();
	ArrayList<String> Name= new ArrayList<>();
	ArrayList<Integer> list= new ArrayList<>();
	ArrayList<ArrayList<Integer>> allMarks = new ArrayList<>();
	Scanner ip=new Scanner (System.in);
	System.out.println("-----Student Management System-----");
	System.out.println("Enter the number of students: ");
	number=ip.nextInt();
	list.add(number);
	for(int i=1;i<=number;i++)
		{
			ArrayList<Integer> mark= new ArrayList<>();
			System.out.println("Please enter the details for the students: "+i);
			System.out.println("Roll no: ");
			rollno=ip.nextInt();			
			System.out.println("Name of the student: ");
			name=ip.next();			
			System.out.println("Number of subjects: ");
			no=ip.nextInt();
			Rollno.add(rollno);
			Name.add(name);
			
			for(int j=1; j<=no; j++) 
				{
				System.out.println("Please enter the subject marks: "+j);
				marks=ip.nextInt();
				mark.add(marks);
				}
			System.out.println("\n");
			 allMarks.add(mark);
		}
	System.out.println("--------Content in the array list---------");
	for (int i=0; i<number;i++) 
		{
		System.out.println("Roll number for the entered student(s): "+Rollno.get(i));
		System.out.println("Name for the entered students(s): "+Name.get(i));
		System.out.println("Marks alloted: "+allMarks.get(i));		
		}
	
	ip.close();
	}
}
