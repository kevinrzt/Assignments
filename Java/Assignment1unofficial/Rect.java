/**
 * Created by kevinxavier on 17/11/16.
 */
public class Rect
    {private int length;
    private int breadth;


    public Rect()
    {
        length=0;
        breadth=0;
    }
    public int getLength(int L)
    {
        return L;
    }
    public int getBreadth(int B)
    {
        return B;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
    public void setBreadth(int breadth)
    {
        this.breadth = breadth;
    }

    public int Area()
    {int A;
        A=this.length*this.breadth;
     return A;
    }
    public void show(int A)
    {
        System.out.println("Area is "+A);
    }
}

