/**
 * Created by kevinxavier on 24/11/16.
 */
import java.util.Scanner;

class Custom
{
    public String key;
    public String value;

    public void read(String key,String value)
    {
        this.key=key;
        this.value=value;
    }
}
public class cushash {
    public static void main(String[] args)
    {   int j,i,n=0,U=0;
        Scanner S=new Scanner(System.in);
        Custom K[]=new Custom[100];
        int choice=0;
        while(choice!=6) {
            System.out.println("Enter the choice.\n1 to add.\n2 to get value of key\n3 to get size of inserted data\n4 to remove\n5 to show details\n6 to exit ");
            choice = S.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the no of elements");
                    n = S.nextInt();
                    for (i = 0; i < n; i++) {
                        K[i] = new Custom();

                        System.out.println("Enter the key and value of " + (i + 1) + " entry");
                        K[i].read(S.next(), S.next());

                    }
                    break;
                case 2:
                    System.out.println("Enter the key");
                    String KK = S.next();
                    for (i = 0; i < n; i++) {
                        if (K[i].key.equals(KK)) {
                            System.out.println("Value is " + K[i].value);
                            U=1;
                        }


                    }
                    if(U==0)
                    {System.out.println("not found");}
                    break;
                case 3:
                    System.out.println("The number of entries :" +n);
                    break;
                case 4:
                    System.out.println("Enter the key");
                    String KKK = S.next();
                    for (i = 0; i < n; i++) {
                        if (K[i].key.equals(KKK)) {
                            
                            for (j = i; j < n; j++) {
                                K[i].key = K[i + 1].key;
                                K[i].value = K[i + 1].value;

                            }
                        }

                    }
                    n--;
                    break;
                case 5:
                    for (i = 0; i < n; i++) {
                        System.out.println("\nThe value for the key " + K[i].key + " is " + K[i].value);
                    }
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
