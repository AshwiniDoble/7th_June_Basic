
public class inheritance01 {
    public static void main(String[] args) {
        InVeryAdvCalc obj = new InVeryAdvCalc();
        int r1 = obj.add(5,6);
        int r2 = obj.sub(3,2);
        int r3 = obj.multi(5,2);
        int r4 = obj.div(10,5);
        double r5 = obj.power(2,4);
        
        System.out.println(r1+ " "+ r2 + " "+ r3 + " "+ r4+ " " + r5);
    }
}
