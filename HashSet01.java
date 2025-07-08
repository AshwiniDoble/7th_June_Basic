package Com.Collection01;

import java.util.HashSet;
import java.util.Set;

public class HashSet01 {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>(); //HashSet --> unordered, no duplicate element

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
