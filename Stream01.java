package Com.StreamAPI01;

import java.util.Arrays;
import java.util.List;

public class Stream01 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,7,2,8,3);

        // for(int i=0; i<nums.size();i++)
        // {
        //     System.out.println(nums.get(i));
        // }

        // for(int n: nums)
        // {
        //     System.out.println(n);
        // }

        nums.forEach (n -> System.out.println(n));
    }
}
