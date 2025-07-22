package Com.Collection01.HashSet0;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[] args) {
        // HashSet hs = new HashSet(); // default capacity is 16 and load factor is 0.75
        // HashSet hs = new HashSet<>(100); // initial capacity 100
        //HashSet hs = new HashSet<>(100, (float)0.90); 
        //HashSet<Integer> hs = new HashSet<Integer>();

        HashSet hs = new HashSet();

        //Add objects/elements into HashSet 
        hs.add(100);
        hs.add("Welcome");
        hs.add(16.4);
        hs.add('X');
        hs.add(true);
        hs.add(null);

        System.out.println(hs);

        //remove()
        hs.remove(16.4);
        System.out.println("After removing the element: "+ hs);

        //contains()
        System.out.println(hs.contains("Welcome")); //true
        System.out.println(hs.contains("XYZ")); //false

        //empty()
        System.out.println(hs.isEmpty()); // false

        //Reading elements/object from HashSet using for..each loop

        /*for (Object e:hs)
        {
            System.out.println(e);
        }*/

        //Reading elements using iterator

        Iterator it = hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
