import java.io.*;
import java.util.*;


class complex
	{private double A;
	private double B;
	public complex()
		{
		A=0;
		B=0;

		} 
	public double add(double A,double B)
		{
		double c=A+B;
		return c;		
		}
	public double sub(double A,double B)
		{
		double c=A-B;		
		return c;		
		}
	public void display(double X,double Y)
		{
		if(Y<0)
			{
			System.out.print(X+"-"+(-1*Y)+"i\n");
			}
		else
			{
			System.out.print(X+"+"+Y+"i\n");
			}
		}

	}

class complexCall
	{
	public static void main(String args[])
		{ 
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the R(A)");
		double R1= S.nextDouble();
		System.out.println("Enter the I(A)");
		double I1= S.nextDouble();	
		System.out.println("Enter the R(B)");
		double R2= S.nextDouble();	
		System.out.println("Enter the I(B)");
		double I2= S.nextDouble();	
		complex C=new complex();
		double AR=C.add(R1,R2);
		double AI=C.add(I1,I2);
		System.out.print("Sum of "+R1+"+"+I1+"&"+R2+"+"+I2+"is :");		
		C.display(AR,AI);
		double SR=C.sub(R1,R2);
		double SI=C.sub(I1,I2);
		System.out.print("Difference of "+R1+"+"+I1+"&"+R2+"+"+I2+"is :");
		C.display(SR,SI);

		
	
		}	
	}
