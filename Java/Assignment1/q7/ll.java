import java.util.*;



class Que<T> implements AbstractCollection<T>
{
    public T pname;
    List<T> PQ=new ArrayList<T>();
    public void read(T pname,int k)
    {
        this.pname=pname;
        PQ.add(k,this.pname);
    }
    public void rem()
    {
        PQ.remove(0);
    }
    public void show()
    {
        System.out.println(PQ);
    }


}

public class ll<T> {
    public static void main(String[] args)throws NoSuchElementException {
        int[] A=new int[100];

        int i,j=0,k;
        for(i=0;i<100;i++)
        {
            A[i]=0;
        }
        Scanner S=new Scanner(System.in);
        Que obj=new Que();
        //List<T> PQ=new ArrayList<T>();


        int choice=0;
        while(choice!=4)
        {System.out.println("Enter the choice\n1 to add patient\n2to remove patient\n3 to view the priority queue\n4 to exit");
            choice=S.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter detail of patient and enter the priority");
                    String pname=S.next();
                    int pr=S.nextInt();

                    j++;

                    for(i=0;i<j;i++)
                    {
                        if(pr>A[i])
                        {
                            for(k=j;k>(i+1);k--)
                            {
                                A[k-1]=A[k-2];
                            }
                            A[i]=pr;
                            break;
                        }
                        else
                        {
                            continue;
                        }
                    }
                    System.out.print("loc is"+(i));
                    obj.read(pname,(i));
                    break;
                case 2:
                    obj.rem();
                    break;
                case 3:
                    obj.show();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }

    }
}
