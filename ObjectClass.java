package tool;
class Laptop {
    String model;
    int price;

    public String toString() {
        return model + " : " + price;
    }

    // public boolean equals(Laptop lap) {
    //     if (lap == null) return false; // null check
    //     return this.model.equals(lap.model) && this.price == lap.price;
    // }
}

public class ObjectClass {
    public static void main(String a[]) {
        Laptop obj1 = new Laptop();
        obj1.model = "Dell";
        obj1.price = 50000;

        Laptop obj2 = new Laptop();
        obj2.model = "Dell";
        obj2.price = 50000;

        Laptop obj3 = new Laptop();
        obj3.model = "Dell";
        obj3.price = 50000;

        //System.out.println(obj1.equals(obj2)); // true
        System.out.println(obj1.equals(obj2) && obj2.equals(obj3));
        //true && false --> 
    }
}

