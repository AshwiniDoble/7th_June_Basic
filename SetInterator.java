package Com.Collection01;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class SetInterator {
    public static void main(String[] args) {
        Collection<Integer> nums = new TreeSet<Integer>(); //Sort the element

        nums.add(20);
        nums.add(80);
        nums.add(32);
        nums.add(67);
        
        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next());

    }
}
