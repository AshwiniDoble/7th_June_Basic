package other;

enum Laptop1{
    Mackbook(2000), XPS(2800), Surface, Thinkpad(1000);

    private int price;

    private Laptop1() {
       price = 500;
    }

    private Laptop1 (int price)
    {
        this.price = price;
        System.out.println("This is Laptop " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class EnumClass {
    public static void main(String[] args) {
        // Laptop1 lap = Laptop1.Mackbook;
        // System.out.println(lap + ": " + lap.getPrice());

        for(Laptop1 lap : Laptop1.values())
        {
            System.out.println(lap + ": " + lap.getPrice());
        }
    }
}
