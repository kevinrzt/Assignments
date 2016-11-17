import java.io.*;
import java.util.*;
class Books
	{
	private String bookname;
	private int bookprice;

	public void createBooks(String bookname,int bookprice)
		{
		this.bookname=bookname;
		this.bookprice=bookprice;		
		}
	
	public void showBooks()
		{
		
		System.out.println(this.bookname+"\t"+this.bookprice);		
		}

	}

class Bookcall
	{
	public static void main(String args[])
		{int i;
		System.out.println("Enter number of books");
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		Books f[]=new Books[n];
		for(i=0;i<n;i++)
			{
			System.out.println("The details of book "+(i+1));			
			f[i]=new Books();
			f[i].createBooks(S.next(),S.nextInt());
			}
		System.out.println("\nBOOK DETAILS");
		System.out.println("\nBOOK NAME\tBOOK PRICE");
		for(i=0;i<n;i++)	
			{
			f[i].showBooks();
			}
		}
	}
