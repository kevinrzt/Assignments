package techm.itp.hydbatch1.csncs517.kevin;
import java.util.*;

/**
 * Created by kevinxavier on 18/11/16.
 */
public class Advisor
{

    private String[] M = new String[5];


    public Advisor()
    {
        M[1]="Have the courage to live a life true to yourself, not the life others expect of you.";
        M[2]="Never attribute to malice that which can be adequately explained by stupidity.";
        M[3]="Don’t make decisions when you’re angry. Don’t make promises when you’re happy.";
        M[4]="Only pack what you can carry yourself.";
        M[0]="Remember you’ll always regret what you didn’t do rather than what you did.";
    }
    public void getAdvice()
    {
        Random rand = new Random();
        int  n = rand.nextInt(4) + 0;
        System.out.println("Advice: "+M[n]);
    }
}
