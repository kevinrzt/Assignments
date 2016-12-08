package techm.itp.hydbatch1.csncs517.kevin;

/**
 * Created by kevinxavier on 18/11/16.
 */
public class Greeter
{

    private String name;
    public Greeter()
    {
        name="kevin";
    }
    public void readName(String name)
    {
        this.name=name;
    }

    public void sayHello()
    {
        System.out.println("Hello, "+this.name);
    }
    public void sayGoodBye()
    {
        System.out.println("Good Bye, "+this.name);
    }


}
