import java.util.Scanner;
import java.util.ArrayList;
class Book
{
	int bookId;
	String title;
	String author;
	int quantity;
}

class Library
{
	ArrayList<Book> books = new ArrayList<>();
	Book b;
	void addBook(int n,String title, String author, int quantity)
	{		
		b = new Book();
		b.bookId=n;
		b.title=title;
		b.author=author;
		b.quantity=quantity;
		books.add(b);	
		System.out.println("Book was added successfully!!!");
	}

	void searchBook(int bid)
	{
		boolean found = false;
		for(Book b:books)
		{
		if(b.bookId==bid)
			{
				System.out.println("The entered book is  found and available at the stock with the quantity");
				found=true;
				break;
			}
		}
		
		if(!found)
		{
			System.out.println("The entered book is not found and not availble in the stock");	
			
		}
		
	}

	void issueBook(int iid)
	{
		boolean found = false;
		for(Book b:books)
		{
		if(b.bookId==iid)
			{
				System.out.println("The entered book is  found and available at the stock with the quantity");
				found=true;				
				System.out.println("The entered book is issued");
				b.quantity--;
				System.out.println("The entered book is availablein the quantity of "+b.quantity);
			}
		}
		if(!found)
		{
			System.out.println("The entered book is not found and not availble in the stock");	
			
		}
		
	}

	void returnBook( int rid)
	{
		boolean found = false;
		for(Book b:books)
		{
		if(b.bookId==rid)
			{
				System.out.println("The entered book is  found and available in library");
				found=true;
					System.out.println("The entered book is returned");
					b.quantity++;
					System.out.println("The entered book is availablein the quantity of "+b.quantity);
			}
		}
		if(!found)
		{
			System.out.println("The entered book is not found in library");	
			
		}
		
	}

	void deleteBook(int did)
	{
		boolean found=false;
		for(Book b:books)
		{
			if(b.bookId==did)
			{
				System.out.println("The entered book is  found and available in library");
				found=true;
				books.remove(did);
			}
		}
		if(!found) 
		{
			System.out.println("The entered book is not found in library");	
		}
	}
	void showBooks()
	{
		for(Book b:books)
		{
			System.out.println("Book Id:"+b.bookId);
			System.out.println("Title of the book: "+b.title);
			System.out.println("Author of the book: "+b.author);
			System.out.println("Quantity availabe as stock: "+b.quantity);
			System.out.println("\n");
		}
	}
}
public class LibraryManagementSystem
{
public static void main(String args[])
{
	int id,quantity;
	String title,author;
	Scanner ip= new Scanner(System.in);
	Library obj=new Library();
	System.out.println("----- Library Management -----");
	
	while(true) 
	{
	System.out.println("\n1. Add Book\r\n"+ "2. Search Book\r\n"+ "3. Issue Book\r\n"+ "4. Return Book\r\n"+ "5. Delete Book\r\n"+ "6. Show All Books\r\n"+ "7. Exit");
	System.out.println("\nEnter Choice: ");
	int ch=ip.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter Book ID:");
			id=ip.nextInt();
			ip.nextLine();
			System.out.println("Enter Title:");
			title=ip.nextLine();
			System.out.println("Enter Author:");
			author=ip.nextLine();
			System.out.println("Enter Quantity:");
			quantity=ip.nextInt();
			obj.addBook(id,title, author,quantity);
			break;
			
		case 2:
			System.out.println("Enter the book ID that to be searched: ");
			int bid=ip.nextInt();
			obj.searchBook(bid);
			break;
			
		case 3:
			System.out.println("Enter the Book ID that is to be issued:");
			int iid=ip.nextInt();
			obj.issueBook(iid);
			break;
			
		case 4:
			System.out.println("Enter the Book ID that is to be returned:");
			int rid=ip.nextInt();
			obj.returnBook(rid);
			break;
			
		case 5:
			System.out.println("Enter the Book ID that is to be deleted:");
			int did=ip.nextInt();
			obj.deleteBook(did);
			break;
		
		case 6:
			obj.showBooks();
			break;
			
		case 7:
			System.exit(7);
			
		default :
			System.out.println("Invalid option");
		}
	}
	
}
}
