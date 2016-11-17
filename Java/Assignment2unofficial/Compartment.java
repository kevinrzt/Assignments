/**
 * Created by kevinxavier on 17/11/16.
 */
import java.util.*;

public abstract class Compartment {
    public abstract void Notice();
}

class Firstclass extends Compartment
{
    public void Notice()
    {
     System.out.println("First Class");
    }
}


class Ladies extends Compartment
{
    public void Notice()
    {
        System.out.println("Ladies");
    }
}


class General extends Compartment
{
    public void Notice()
    {
        System.out.println("General");
    }
}


class Luggage extends Compartment
{
    public void Notice()
    {
        System.out.println("Luggage");
    }
}

class TestCompaartment
{
    public static void main(String args[])
    {
        Compartment A[]=new Compartment[10];
        for(int i=0;i<10;i++)
        {   Random rand = new Random();
            int  n = rand.nextInt(4) + 1;
         if(n==1)
         {
             A[i]=new Firstclass();
         }
         else if(n==2)
         {
             A[i]=new Ladies();
         }
         else if(n==3)
         {
             A[i]=new General();
         }
         else
         {
             A[i]=new Luggage();
         }
        }
        for(int i=0;i<10;i++)
        {
            System.out.print("The "+(i+1)+"th token is ");
            A[i].Notice();
        }
    }
}