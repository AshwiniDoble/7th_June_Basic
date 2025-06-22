package tool;

abstract class Car  //Abstract Class
{
    public abstract void drive(); //Abstract method
    public abstract void fly();
    
    public void playMusic()
    {
        System.out.println("Playing Music");
    }
}

abstract class WagnoR extends Car
{
    public void drive()
    {
        System.out.println("Driving");
    }
}

class UpdateWagonR extends WagnoR //Concrete class
{

    public void fly() {
        System.out.println("Flying");
    }

    
}

public class AbstractClass 
{
    public static void main(String[] args) {
        Car obj = new UpdateWagonR();
        obj.playMusic();
        obj.drive();
        obj.fly();
    }

}
