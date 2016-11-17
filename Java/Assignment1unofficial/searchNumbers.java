import java.io.*;
import java.util.*;


public class searchNumbers
	{
	public static void main(String args[])
		{int i,b1=0,a1=0;
		int[] A={2,43,3,32,5}; 
		System.out.print("java prob");
		Scanner S=new Scanner(System.in);
		int a=S.nextInt();
		int b=S.nextInt();
		System.out.print("Your first number was "+a+"\n");
		System.out.print("Your second number was "+b+"\n");
		for(i=0;i<5;i++)
			{
			if(A[i]==a)
			{a1=1;
			}
			else if(A[i]==b)
			{
			b1=1;
			}
			}
		if(a1==1&&b1==1)
		{
		System.out.println("Its Bingo\n");		
		}
		else
		{
		System.out.println("Not Found\n");
		}
		System.out.println("The array was:");
		for(i=0;i<5;i++)
			{
			System.out.print(A[i]+" ");
				
			}
		System.out.println("\n");
		}
	}
