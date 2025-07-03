package Interface001;

interface B
{
    void show(int i);
}

public class ParamLambda {
    public static void main(String[] args) {
        B obj = i -> System.out.println("In show.." + i);
        
        obj.show(5);
    }
}
