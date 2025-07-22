package Com.Collection01.LinkedList0;

import java.util.LinkedList;
import java.util.List;

import java.util.Iterator;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        //Declare LinkedList
        // LinkedList l = new LinkedList();
        // LinkedList<Integer> l= new LinkedList<Integer>();
        // LinkedList<String> l= new LinkedList<String>();

        LinkedList l = new LinkedList();

        //Add elements into linkedList

        l.add(100);
        l.add("Welcome");
        l.add(15.5);
        l.add('A');
        l.add(true);
        l.add(null);

        System.out.println(l); //[100, Welcome, 15.5, A, true, null]
        System.out.println(l.size()); // 6

        //remove
        l.remove(3);
        System.out.println("After removing: "+ l); //[100, Welcome, 15.5, true, null]

        //Inserting / adding the element in the middle of linked list
        l.add(3,"Java");
        System.out.println("After inserting element: "+ l);

        //retriveing the element
        System.out.println(l.get(3));

        //change the value
        l.set(5,"X");
        System.out.println("After changing the value: "+ l);

        //Contains
        System.out.println(l.contains("Java")); // true
        System.out.println(l.contains("Python")); // false

        //isEmpty
        System.out.println(l.isEmpty()); // false

        //Reading elements from LL using for loop

        /*for (int i=0; i<l.size();i++)
        {
            System.out.println(l.get(i));
        }*/

        //Reading elements from LL using for each loop
        /*for(Object e:l)
        {
            System.out.println(e);
        }*/

        //Reading elements from LL using iterator method

        Iterator it = l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
}
