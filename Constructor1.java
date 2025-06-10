class Human{
    private int salary;
    private String name;
    public Human(){
        salary=20000;
        name="Ram";
        System.out.println("In a constructor...");
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

public class Constructor1 {
    public static void main(String[] args) {
        Human obj1 = new Human();
        System.out.println(obj1.getName()+ ": " + obj1.getSalary());
        Human obj2 = new Human();
        
    }
}
