package other;

interface Computer
{
    void code();
}

class Laptop implements Computer
{

    public void code() {
        System.out.println("code, compile, run");
    }
    
}

class Desktop implements Computer
{
    public void code() {
        System.out.println("code, compile, run, faster..");
    }

}

class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}

public class InterfaceNeed {
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer lap = new Laptop();

        Developer dev = new Developer();
        dev.devApp(desk);

        // desk.code();

    }
}
