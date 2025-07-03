package Interface001;

@FunctionalInterface
interface AB
{
    int add(int i, int j);
}

public class LambdaExpReturn {
    public static void main(String[] args) {

        AB obj = (i,j) -> i+j;

           System.out.println(obj.add(5, 4));
    }
}
