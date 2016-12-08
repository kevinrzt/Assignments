/**
 * Created by kevinxavier on 18/11/16.
 */
import java.util.*;
public class Number {
    private int a;
    private int b;
    private double S;

    public Number(int a,int b)
    {
        a=a;
        b=b;
    }
    public void readNo(int a, int b)
    {
        this.a =a;
        this.b=b;
    }
    public void add()
    {
        S=this.a+this.b;
        System.out.println("Sum is "+S);
    }
    public void sub()
    {
        S=a-b;
        System.out.println("Diff is "+S);
    }
    public void mul()
    {
        S=a*b;
        System.out.println("pro is "+S);
    }
    public void div()
    {if(b!=0) {
        S = a / b;
        System.out.println("quo is " + S);
    }
    else
    { throw new ArithmeticException("0 not valid");}
    }


    public static void main(String args[])
    {

        Scanner S=new Scanner(System.in);
        System.out.println("Enter the numbers and option \n 1 to Add\n2 to Substract\n3 to Multiply\n4 to Divide ");
        Number No=new Number(0,0);
        No.readNo(S.nextInt(),S.nextInt());
        switch (S.nextInt())
        {
            case 1:No.add();
                    break;
            case 2:No.sub();
                    break;
            case 3:No.mul();
                    break;
            case 4:No.div();
                    break;
            default:System.out.println("Wrong Choice");
        }
    }
}

