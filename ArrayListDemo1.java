package Com.Collection01.ArrayList0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo1 {
    public static void main(String[] args) {

        //Declare ArrayList
        //ArrayList al = new ArrayList<>(); //Array with heterogenious data
        //ArrayList<Integer> al = new ArrayList<Integer> (); //Array with homogenious data
        //ArrayList<String> al = new ArrayList<String> (); //Array with homogenious data

        //List al = new ArrayList<>();

        ArrayList al = new ArrayList<>();

        //Add new elements to the arraylist
        al.add(100);
        al.add("Welcome");
        al.add('A');
        al.add(15.5);
        al.add(true);

        System.out.println(al);

        //size
        System.out.println("number of elements in arraylist: " + al.size()); // number of elements

        //remove
        System.out.println("Removing the element: " + al.remove(1));// here removing element using index
        //System.out.println(al.remove("Welsomce")); // removing element using the object
        System.out.println("After removing element from arraylist: " + al);

        //Insert a new element 
        //add(index, object)
        al.add(2,"Python");
        System.out.println("After insertion: "+ al);

        //retrieve the specific element
        System.out.println("After retrieving the element: "+al.get(2));

        //change element/replace element
        al.set(2, "C#");
        System.out.println("After replacing elements: " + al);

        //search - contains()
        System.out.println(al.contains("C#")); //true
        System.out.println(al.contains("Java")); // false

        //isEmpty
        System.out.println(al.isEmpty());

        System.out.println(al);

        //1) for loop
        System.out.println("Reading elements using for loop");

        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        //2) for..each
        /*System.out.println("Reading elements using for each loop");

        for(Object e: al)
        {
            System.out.println(e);
        }*/ 


        //3) iterator
        System.out.println("Reading elements using iterator method");

        Iterator it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next()); // printing the element and move to next
        }


    }
}
