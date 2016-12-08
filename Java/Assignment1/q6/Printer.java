/**
 * Created by kevinxavier on 23/11/16.
 */
import java.util.*;
class Printercall
{
    int taskid;
    int pgno;
    int time;
    int waittime;


}

public class Printer
{
    public static void main(String[] args)
    {   int i=0,n=0,Sum=0,choice=0,j,k,tp=0;
        Scanner S=new Scanner(System.in);




        Queue<Printercall> qu = new LinkedList<Printercall>();
        System.out.println("Enter the printing rate ie time for 1 page to printin mins");
        int t=S.nextInt();
        Printercall P[] = new Printercall[20];

        while(choice!=5)
        { System.out.println("Enter the choice.\n1 to add task\n2 to remove elements\n3 to know wait time\n4 to show the queue \n5 to exit ");
            choice=S.nextInt();
            switch (choice) {
                case 1:
                   System.out.println("Enter the number of tasks");
                   n = S.nextInt();

                    for (i = 0; i < n; i++) {

                        System.out.println("Enter Details of task " + (i + 1) + ".taskid and no of pages");
                        P[i]=new Printercall();
                        P[i].taskid=S.nextInt();
                        P[i].pgno=S.nextInt();
                        tp=tp+P[i].pgno;
                        if(tp>20){System.out.println("Capacity reached.Enter smaller value .");tp=tp-P[i].pgno;P[i].pgno=S.nextInt();tp=tp+P[i].pgno;}
                        P[i].time = t * P[i].pgno;
                        Sum = Sum + P[i].time;
                        P[i].waittime = Sum;
                        qu.add(P[i]);
                        //i++;
                    }
                    System.out.println(qu);
                    break;
                case 2:

                   for (j = 1; j < i; j++) {
                       P[j].waittime = P[j].waittime - P[0].waittime;
                    }
                    qu.poll();
                   // System.out.println(qu);
                    //i--;
                    break;
                case 3:
                    System.out.println("Enter task id");
                    int tkid = S.nextInt();
                    for (i = 0; i < n; i++) {
                        if (tkid == P[i].taskid) {
                            System.out.println("The wait time is " + P[i].waittime);
                        }
                    }
                    break;
                case 4:
                    qu.size();
                    for (Printercall it:qu) {
                        System.out.println("\nTask id: " + it.taskid + "\nPage No: " + it.pgno + "\nTime: " + it.time + "\nWait time: " + it.waittime + "\n\n");
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }





    }

}
/*
 Consider a printer which is capable of printing ‘n’ pages per minute. Build a program
  which accepts print tasks and execute them one after the other (use queue), each task
  could be anywhere from 1 to 20 pages long.

a. Create a class to maintain the details of print task which must have methods to add/update
 the remaining pages,update the wait time for the print task to be executed.

b. Create a class called Printer to take care of adding,removing and executing the tasks.
This must have methods to know the number of tasks pending in the queue, to remove the
print task from the queue using the id. Depending on the total number of pages to print,
restrict the number of print tasks which can be added to the queue. Update wait time of
all the pending tasks after executing each task and record the time taken for each task with details.
 */