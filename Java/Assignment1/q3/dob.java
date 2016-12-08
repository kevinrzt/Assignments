import java.util.Date;
import java.util.*;
import java.text.SimpleDateFormat;


public class dob
{
    public String name;
    private String bday;
    private String[] nicknames= new String[20];

    void nick(String nik,int j)
    {
        this.nicknames[j]=nik;
    }

    void show(int j)
    {   int i;
        System.out.println("The names are");
        for(i=0;i<j;i++)
        {
            System.out.println(this.nicknames[i]);
        }
    }

    void remove()
    {   int i;
        for(i=0;i<20;i++)
        {this.nicknames[i]=null;}
    }

    public void calage(String name,String bday)
    {   this.name=name;
        this.bday=bday;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date day = Calendar.getInstance().getTime();
        String today = format.format(day);

        try
        {
            Date d1 = format.parse(bday);
            Date d2 = format.parse(today);

            long diff = d2.getTime() - d1.getTime();


            long diffYears = (diff / (24 * 60 * 60 * 1000)) / 365;

            System.out.print(name+" is "+diffYears + " years old");


        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}

class dobmain
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the number of people");
        int n=S.nextInt();
        dob D[]=new dob[n];
        for(i=0;i<n;i++)
        {
            System.out.println("\nEnter the name and birthday of for person "+(i+1));
            String name = S.next();
            String bday = S.next();

            System.out.println("Enter the number of  nicknames ");
            int m=S.nextInt();

            D[i] = new dob();
            D[i].calage(name, bday);
            System.out.println("Enter the nicknames ");
            for(j=0;j<m;j++)
            {
                D[i].nick(S.next(),j);
            }


            D[i].show(j);
        }

        System.out.println("Enter the name to be removed");
        String rem=S.next();
        for(i=0;i<n;i++)
        {
            if(D[i].name.equals(rem))
            {
                D[i].remove();

            }
        }

    }
}

/* A person has a name and an age. You can ask him what is his birthday or what is his age
and he will give you the answer (use Date class to store date of birth as state, don't store
 age as int - calculate it based on current date and the dob). Two persons are said to be equal
  if they have the same name and same date of birth. Implement the solution for this (override
  equals method of Object class) and test it in a tester class. Also the person has number of
  nicknames. He can tell how many names he has and if you ask him to forget, he will forget all
   his names and start afresh. You can also ask him to recite all his names in one shot.
    Write a program to implement this.
 */