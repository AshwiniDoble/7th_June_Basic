package tool;

// UPCASTING & DOWNCASTING

class A 
{
    public void show()
    {
        System.out.println("In A show");
    }
}
class B extends A
{
    public void show1()
    {
        System.out.println("In B show");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        A obj = (A) new B(); // Upcasting --> it can be written as A obj = new B()
        obj.show();

        B obj1 = (B) obj; // Downcasting
        obj1.show1();
    }
}
