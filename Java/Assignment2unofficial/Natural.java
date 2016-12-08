/**
 * Created by kevinxavier on 18/11/16.
 */
import java.util.*;
public class Natural {

    public double avgFirstN(int N)
    {int i;
        double Avg=0;
        if(N>0)
        {
        for (i = 1; i <= N; i++)
            {Avg = Avg + i;
            }
            Avg = (Avg / N);
        }
     else
    {
        throw new IllegalArgumentException("not valid");
    }
        return Avg;

    }

    public static void main(String args[]) {
        Natural Na = new Natural();
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the n ");
          double K=Na.avgFirstN(S.nextInt());
        System.out.println("Average is"+K);
    }
}
