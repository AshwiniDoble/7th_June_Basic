package tool;

public class Practice {
    public static void main(String[] args) {
        System.out.println("This is main method 1");

        int[] arr={1,2,3};
        main(arr); // manually calling the overloaded main method

    }

    public static void main(int[] a) {
        System.out.println("This is main method 2");
        
    }
}
