/**
 * Created by kevinxavier on 17/11/16.
 */
import java.util.*;
public class TestRectangle {
    public static void main(String args[])
    {   int i;
        Rect R[]=new Rect[5];
        Scanner S=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            R[i]=new Rect();
            System.out.println("enter length breadth of rectangle "+(i+1));
            int A=R[i].getLength(S.nextInt());
            int B=R[i].getBreadth(S.nextInt());
            R[i].setLength(A);
            R[i].setBreadth(B);
            int C=R[i].Area();
            R[i].show(C);
        }
    }
}
