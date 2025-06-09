class Calculator{
    public int add(int n1, int n2){
        return n1+n2;
    }

    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public double add(double n1, int n2){
        return n1+n2;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int r= calc.add(2,3);
        System.out.println(r);

        int s=calc.add(3,5,6 );
        System.out.println(s);

        double t = calc.add(4,7);
        System.out.println(t);
    }
}
