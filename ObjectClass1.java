package tool;

class Laptop
{
    String model;
    int price;

    
   
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }


}

public class ObjectClass1 {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model="Lenovo Yoga";
        obj.price=5000;

        System.out.println(obj.toString());
    }
}
