import techm.itp.hydbatch1.csncs517.kevin.Greeter;
import techm.itp.hydbatch1.csncs517.kevin.Advisor;
import java.util.*;

class Greeterclass
{
    public static void main(String args[])
    {int i;
        Scanner S=new Scanner(System.in);
        Advisor A=new Advisor();
        System.out.println("Enter the number of names");
        int n=S.nextInt();
        Greeter G[]=new Greeter[n];
        for(i=0;i<n;i++)
        {
            G[i]=new Greeter();
            G[i].readName(S.next());

        }
        for(i=0;i<n;i++)
        {

            G[i].sayHello();
        }
        A.getAdvice();
        for(i=(n-1);i>=0;i--)
        {

            G[i].sayGoodBye();

        }

    }
}