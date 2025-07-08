package Com.Collection01;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<Integer>(); //Sort the element

        nums.add(20);
        nums.add(80);
        nums.add(32);
        nums.add(67);
        nums.add(32);

        for(Integer n : nums)
        {
            System.out.println(n);
        }

    }
}
