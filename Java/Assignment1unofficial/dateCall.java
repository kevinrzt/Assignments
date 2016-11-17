import java.io.*;
import java.util.*;


class date1
	{private int day;
	private int month;
	private int year;
	public date1()
		{
		int day=28;
		int month=5;
		int year=1994;	
		} 
	public void add(int day,int month,int year)
		{
		this.day=day;
		this.month=month;
		this.year=year;		
		}
	public void errorcheck(int day,int month,int year)
		{
		if(this.month>0&&this.month<=12)
			{
			if(this.month==1||this.month==3||this.month==5||this.month==7||this.month==8||this.month==10||this.month==12)
				{
				if(this.day<=31&&this.day>0)				
					{
					System.out.println("Valid Date");
					}
				else
					{
					System.out.println("1Invalid Date");		
					}

				}
			else if(this.month==4||this.month==6||this.month==9||this.month==11)
				{
				if(this.day<=30&&this.day>0)				
					{
					System.out.println("Valid Date");
					}
				else
					{
					System.out.println("2Invalid Date");		
					}
			
				}
			else if(this.month==2)
				{
				if(this.year%4==0)
					{if(this.month<=29&&this.month>0)
						{
						System.out.println("Valid Date");
						}
					else 
						{
						System.out.println("3Invalid Date");
						}
					}
				else
					{if(this.day<=29&&this.day>0)
						{
						System.out.println("Valid Date");
						}
					else 
						{
						System.out.println("4Invalid Date");
						}
					}
					
					
					
				}
		else
			{
			System.out.println("5Invalid Date");		
			}		
			}
		else 
			{
			System.out.println("6Invalid Date");		
			}		
		}

	}


class employee
	{private int emno;
	private String emname;
	private int day;
	private int month;
	private int year;

	public void adduser(int emno,String emname,int day,int month,int year)
		{
		this.emno=emno;
		this.emname=emname;
		this.day=day;
		this.month=month;
		this.year=year;
		}
	public void show()
		{
		System.out.println(emno+"\t"+emname+"\t"+this.day+"/"+this.month+"/"+this.year+"\n");		
		}	
		
	}

class dateCall
	{
	public static void main(String args[])
		{int i;
		date1 D=new date1();
		Scanner S=new Scanner(System.in);
		System.out.println("Enter no of Employees ");
		int n=S.nextInt();	
		employee f[]=new employee[n];	
		for(i=0;i<n;i++)		
			{
			f[i]=new employee();		
			System.out.println("Enter Employee number");
			int emno=S.nextInt();
			System.out.println("Enter Employee name");
			String emname=S.next();		
			System.out.println("Enter the date,month,year");
			int day=S.nextInt();
			int month=S.nextInt();
			int year=S.nextInt();
			
			f[i].adduser(emno,emname,day,month,year);
			D.add(day,month,year);
			D.errorcheck(day,month,year);
			}	
		for(i=0;i<n;i++)
			{
			f[i].show();
			}		
		}	
	}
