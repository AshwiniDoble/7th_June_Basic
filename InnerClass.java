package tool;

class A
{
    int age;

    public void show()
    {
        System.out.println("In A show");
    }

    static class B
    {
        public void config()
        {
            System.out.println("In B config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        
        //A.B obj1 =  obj.new B(); // calling syntax for non-static inner class
        A.B obj1 = new A.B(); // calling static inner class
        obj1.config();
    }
}
