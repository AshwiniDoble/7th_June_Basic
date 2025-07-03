package Interface001;

interface AA
{
    void show();
}

public class LambdaExp01 {
    public static void main(String[] args) {
        AA obj = () -> System.out.println("In Show..");

        obj.show();
    }
}
