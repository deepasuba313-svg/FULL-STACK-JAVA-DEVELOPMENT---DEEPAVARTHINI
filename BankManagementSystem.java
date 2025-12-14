import java.util.Scanner;
import java.util.ArrayList;

class Base 
{
	int accountno =0;
	int initialamt =0;
	int deposit =0;
	int withdraw =0;
	int balance=0;
	String name;
	
}
class AddAccount extends Base 
{
	AddAccount(int accno, String n,int iniamt,int bal)
	{
		this.accountno=accno;
		this.name=n;
		this.initialamt=iniamt;
		this.balance=bal;
		balance=balance+iniamt;
	}
	void display()
	{
		System.out.println("Account Added Successfully!");
	}
}

class Deposit extends Base
{
	Deposit(int accno,int amt,int bal) 
	{
		this.accountno=accno;
		this.deposit=amt;
		this.balance=bal;
		balance=balance+deposit;
	}
	
	void display() 
	{
		System.out.println("Deposit Successful!");
		System.out.println("New Balance: "+balance);
	}
}

class Withdraw extends Base 
{
	Withdraw(int accno,int amt,int bal)
	{
		this.accountno=accno;
		this.withdraw=amt;
		this.balance=bal;
		balance=balance-withdraw;
	}
	void display() 
	{
		System.out.println("Withdrawal Successful!");
		System.out.println("New Balance: "+balance);
	}
}
public class BankManagementSystem 
{
public static void main(String args[])
	{
	Scanner ip=new Scanner(System.in);
	int accountno =0;
	int initialamt=0 ;
	int deposit=0;
	int withdraw=0;
	int balance=0;
	String name;
	ArrayList<Integer> array=new ArrayList<>();
	ArrayList<Integer> bal=new ArrayList<>();
	ArrayList<String> sname=new ArrayList<>();
	
	int ch;
	System.out.println("----- Bank Management System -----");
	while(true) {
	try
	{
		System.out.println("\n1. Add Account\r\n" + "2. Deposit\r\n" + "3. Withdraw\r\n" + "4. Show Accounts");
		System.out.println("\nEnter Choice: ");
		ch=ip.nextInt();
		switch(ch)
		{
		case 1:
		    System.out.println("Enter Account Number:");
		    accountno = ip.nextInt();
		    array.add(accountno);

		    System.out.println("Enter Name: ");
		    name = ip.next();
		    sname.add(name);

		    System.out.println("Enter Initial Balance:");
		    initialamt = ip.nextInt();
		    bal.add(initialamt);   // FIXED

		    AddAccount obj1 = new AddAccount(accountno, name, initialamt, initialamt);
		    obj1.display();
		    break;

		case 2:
		    System.out.println("Enter Account Number:");
		    accountno = ip.nextInt();

		    if (array.contains(accountno)) {
		        int index = array.indexOf(accountno);  // FIXED

		        System.out.println("Enter amount to be deposited:");
		        deposit = ip.nextInt();

		        int oldBalance = bal.get(index);
		        int newBalance = oldBalance + deposit;

		        bal.set(index, newBalance);  // FIXED

		        Deposit obj2 = new Deposit(accountno, deposit, newBalance);
		        obj2.display();
		    } else {
		        System.out.println("Please create a new account to deposit!!!");
		    }
		    break;

		case 3:
		    System.out.println("Enter Account Number:");
		    accountno = ip.nextInt();

		    if (array.contains(accountno)) {
		        int index1 = array.indexOf(accountno);

		        System.out.println("Enter amount to be withdrawn:");
		        withdraw = ip.nextInt();

		        int oldBalance = bal.get(index1);
		        int newBalance = oldBalance - withdraw;

		        bal.set(index1, newBalance);

		        Withdraw obj3 = new Withdraw(accountno, withdraw, newBalance);
		        obj3.display();
		    } else {
		        System.out.println("Please create a new account to withdraw");
		    }
		    break;

		case 4:
			System.out.println("Displaying the content");
			for(int j=0;j<array.size();j++)
			{
				System.out.println("Account number:"+array.get(j));
				System.out.println("Name of the account holder:"+sname.get(j));				
			}
			break;
			
		default :
			System.out.println("Wrong option selected");
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}
	}
}
