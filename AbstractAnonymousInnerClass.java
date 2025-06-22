package tool;

abstract class A1
{
    public abstract void show();
    public abstract void config();

}

public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {
        A1 obj = new A1() 
        {
            public void show()
            {
                System.out.println("In new show");
            }
            public void config()
            {
                System.out.println("In a config");
            }
        };
        obj.show();
        obj.config();
    }
}
