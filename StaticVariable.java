class Mobile{
    String brand;
    int price;
    String network;
    static String name; // instance static variable

    public void show()
    {
        System.out.println(brand + " " + price + " " + name + " "); 

        //Note: We can use static variable inside non-static method there is no harm
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone"; //if we made the variable static we can call the variable by it's class name no need to create object

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "SmartPhone";

        obj1.name = "phone"; // static variable changes the value for all the objects (common for all)

        obj1.show();
        obj2.show();

    }
}
