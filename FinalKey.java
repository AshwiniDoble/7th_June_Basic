package tool;
//final --> variable, method, class

final class Calc{ // if you make class final we can't inherit the class
    public final void show(){ // if you are making method fina we can't override the method in subclass
    final int num=9; // if we make variable final we can't change the value of it. it will be constant
    num =10;
        System.out.println("by Namit");
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }

}

class AdvCalc extends Calc{
    public void show()
    {
        System.out.println("by John");
    }
}


public class FinalKey {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(6, 3);
    }
}
