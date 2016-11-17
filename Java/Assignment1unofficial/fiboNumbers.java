import java.io.*;
import java.util.*;


public class fiboNumbers
	{
	public static void main(String args[])
		{int i,c;
		System.out.print("java prob");
		Scanner S=new Scanner(System.in);
		int a=S.nextInt();
		int b=S.nextInt();
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(i=0;i<13;i++)
			{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			}
	
		}
	}
