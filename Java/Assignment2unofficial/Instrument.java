/**
 * Created by kevinxavier on 17/11/16.
 */
public abstract class Instrument {
    public abstract void play();

}

class Piano extends Instrument
{
    public void play()
    {
        System.out.println("Piano is playing tan tan tan tan ");
    }
}

class Flute extends Instrument
{
    public void play()
    {
        System.out.println("Flute is playing toot toot toot toot");
    }
}

class Guitar extends Instrument
{
    public void play()
    {
        System.out.println("Guitar is playing tin tin tin");
    }
}

class Ins
{
    public static void main(String args[])
    {Instrument A[] =new Instrument[10];
        A[0]=new Piano();
        A[1]=new Flute();
        A[2]=new Guitar();
        A[3]=new Piano();
        A[4]=new Flute();
        A[5]=new Guitar();
        A[6]=new Piano();
        A[7]=new Flute();
        A[8]=new Guitar();
        A[9]=new Piano();
        for(int i=0;i<10;i++)
        {
            A[i].play();
        }
    }

}
