import java.util.*;
import java.util.Scanner.*;


// Parent class
class Room
	{
	int number;
	int days;

	void display() 
		{
		System.out.println("--------Welcome to Smart Room Management---------");
		}
	}

// Child class 1
class DeluxeRoom extends Room
	{
	int amount = 5000;
	int a;
	DeluxeRoom(int n, int d)
		{
		this.number=n;
		this.days=d;
		a= d*amount;
		}
	void display() 
		{
		System.out.println("\n\tNumber of person in a single deluxe room: "+number); 
		System.out.println("\n\tNumber of days stay: "+days); 
		System.out.println("\n\tAmount for deluxe room: "+amount ); 
		System.out.println("\n\tTotal amount for staying in deluxe room: "+a); 
		}
	}

// children class 2
	class SuitRoom extends Room
	{
	int amount = 2000;
	int a;
	SuitRoom(int n, int d)
		{
		this.number=n;
		this.days=d;
		int amount = 2000;
		a= d*amount;
		}
	void display() 
		{
		System.out.println("\n\tNumber of person in a single Suit room: "+number); 
		System.out.println("\n\tNumber of days stay: "+days); 
		System.out.println("\n\tAmount for Suit room: "+amount); 
		System.out.println("\n\tTotal amount for staying in Suit room: "+a); 
		}
	}


// Main class
class Main 
{
	public static void main(String args[])
	{
	int d1=0;
	int n1=0;
	Scanner ip=new Scanner (System.in);
	int ch;
	System.out.print("Please choose 1 for Dulexe Room (or) 2 for Suit Room: ");
	ch=ip.nextInt();

	switch(ch) 
		{
		case 1:
 			System.out.println("-------You had selected Deluxe Room---------");
			System.out.print("Please enter the total number of persons: ");
			n1=ip.nextInt();
			System.out.print("Please enter the total number of days for staying: ");
			d1=ip.nextInt();
			break;

		case 2:
 			System.out.println("-------You had selected Suit Room---------");
			System.out.print("Please enter the total number of persons: ");
			n1=ip.nextInt();
			System.out.print("Please enter the total number of days for staying: ");
			d1=ip.nextInt();
			break;

		default :
 			System.out.println("Invalid Choice!!! Please enter correct choice");
			break;
		}

		if (ch==1)
			{
			DeluxeRoom obj=new DeluxeRoom(n1,d1);
			obj.display();
			}
		else 
			{
			SuitRoom obj=new SuitRoom(n1,d1);
			obj.display();
			}
	}
}

