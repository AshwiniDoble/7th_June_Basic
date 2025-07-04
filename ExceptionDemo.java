package Com.ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int i = 5;
        int j = 0;

        try
        {
            j=18/0;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong..");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
