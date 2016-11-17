import java.io.*;
import java.util.*;


public class evenNumbers
	{
	public static void main(String args[])
		{int i;
		System.out.println("Enter number");
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		System.out.println("Even number are:");
		for(i=1;i<=n;i++)
			{if(i%2==0)
				{
				System.out.println(i);
				}	
			}
		}
	}
