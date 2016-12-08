/**
 * Created by kevinxavier on 23/11/16.
 */
import java.util.*;
public class toys {
    public static void main(String[] args) {
        int i = 0;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter number of employees");
        int n = S.nextInt();
        List<String> lis = new ArrayList<String>();
        while (i < n) {
            System.out.println("Enter " + (i + 1) + " employee");
            String A = S.next();
            lis.add(A);
            i++;
        }
        System.out.println(lis);
        Random rand = new Random();

        int k = rand.nextInt(n - 1) + 0;
        // lis.get(k);
        System.out.println("The Lucky person is " + lis.get(k));

        Set<String> se = new HashSet<String>(lis);
        System.out.println("Unique set\n" + se);

        HashMap<String,Integer> map= new HashMap<String,Integer>();
        int Y=1;

        for(String F:lis)
        {
                if (map.containsKey(F))
                {
                    Y=map.get(F);
                    Y++;
                    map.put(F,Y);

                }
                else
                {
                    map.put(F,1);
                }

        }
        System.out.println("map is "+map);



        Queue<String> qu=new LinkedList<String>(lis);
        System.out.println("The queue is "+qu);


        System.out.println("The employee on the head of queue got ticket.so hes removed");
        qu.poll();

        System.out.println("The new queue is"+qu);


    }
}


/*
 Consider the four core interfaces, Set, List, Queue, and Map. For each of the following four assignments,
 specify which of the four core interfaces is best-suited, and write a program to explain how to use it to
  implement the assignment.

a. Tripple Ess Toys(TET) needs to record the names of all its employees. Every month, an employee will be
 chosen at random from these records to receive a free toy.

b. TET has decided that each new product will be named after an employee but only first names will be used,
 and each name will be used only once. Prepare a list of unique first names.

c. TET decides that it only wants to use the most popular names for its toys. Count up the number of
employees who have each first name.

d. TET acquires season tickets for the local lacrosse team, to be shared by employees. Create a
waiting list for this popular sport.
 */