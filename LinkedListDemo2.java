package Com.Collection01.LinkedList0;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("X");
        l.add("Y");
        l.add("Z");
        l.add("A");
        l.add("B");
        l.add("C");

        LinkedList new_l = new LinkedList<>();
        new_l.addAll(l);        
        System.out.println("After adding the new linkedlist: "+ l);

        new_l.removeAll(l);
        System.out.println("After removing the list: "+ new_l);

        //sort  -- Collections.sort(Collection)

        System.out.println("Before sorting : "+ l);
        Collections.sort(l);
        System.out.println("After sorting the element: "+ l);

        // reverse order
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("reverse order of linkedlist elements: "+ l);

        //shuffling

        Collections.shuffle(l);
        System.out.println("After shuffling: " + l);


    }
}
