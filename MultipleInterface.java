package other;

interface X
{
    void show();
    void config();
}
interface Y
{
    void run();
}

interface W extends X
{

}

class Z implements X,Y
{
    public void show()
    {
        System.out.println("Showing..");
    }
    public void config()
    {
        System.out.println("Config..");
    }
    public void run()
    {
        System.out.println("Running..");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        X obj;
        obj = new Z();
        obj.show();
        obj.config();

        Y obj1;
        obj1=new Z();

        obj1.run();

    }
}
