class Employee{
    private int salary;
    private String name;

    public Employee() // default constructor
    {
        salary = 20000;
        name = "Ritu";
    }

    public Employee(String name, int salary) // parameterized constructor
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    
}

public class ConstructorType {
    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println(obj.getName()+ ": " + obj.getSalary());
        
        Employee obj1 = new Employee("Ashwini",60000);
        System.out.println(obj1.getName()+ ": " + obj1.getSalary());


    }
}
