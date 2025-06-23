package tool;

interface A
{
    int age= 10;    //static & final
    String area ="Mumbai";
    void show();
    void config();

}
class BA implements A
{

    
    public void show() 
    {
      System.out.println("In Show");
    }

    public void config()
    {
      System.out.println("In Config");
    }
    
}
public class Interface1 {
    public static void main(String[] args) {
        A obj;
        obj = new BA();
        obj.show();
        obj.config();

        System.out.println(A.area);

    }
}
