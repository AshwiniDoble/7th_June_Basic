package Com.ThreadExamples;

class A extends Thread
{
    public void run()
    {
        for(int i=1; i<=100; i++)
        {
            System.out.println("Hi");
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=1; i<=100; i++)
        {
            System.out.println("Hello");
        }
    }
}

public class ThreadEx1 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
