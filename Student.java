/* Just think about and create a class with:
name
roll
marks (array)
total
average

And three methods:
calculateTotal
calculateAverage
display
 */
import java.util.ArrayList;
import java.util.Scanner;
class Sample 
{
int roll,total;
int marks[];
double avg;
String name;
Sample(int rollno, String n, int t, double a, ArrayList<Integer> mark) 
{
    this.roll = rollno;
    this.name = n;
    this.total = t;
    this.avg = a;

    this.marks = new int[mark.size()];
    for(int i = 0; i < mark.size(); i++)
        this.marks[i] = mark.get(i);
}

void total() 
	{
	System.out.println("Total: "+this.total);
	}
void average() 
	{
	System.out.println("Average: "+this.avg);
	}
void display() 
	{
	System.out.println("-----Student Management System-----");
	System.out.println("Roll no: "+this.roll);
	System.out.println("Name: "+this.name);
	}
}

public class Student
{
public static void main(String args[])
	{
	String name;
	int roll,mark=0,n,total=0;
	double avg=0.0;
	 ArrayList<Integer> list = new ArrayList<>();
	
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter the name: ");
	name=ip.next();
	System.out.println("Enter Roll number: ");
	roll=ip.nextInt();
	System.out.println("Enter total number number of subjects: ");
	n=ip.nextInt();
	for (int i=1;i<=n;i++) 
	 	{
		System.out.println("Enter the subject marks "+i+":");
		mark=ip.nextInt();	
		list.add(mark);
		total=total+mark;
	 	}
	avg=total/n;
	System.out.println("Marks inside the array list was:");
	System.out.println(list);
	Sample obj=new Sample(roll,name,total,avg,list);
	obj.display();
	obj.total();
	obj.average();
	
	}
}

