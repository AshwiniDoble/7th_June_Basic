package Com.Collection01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>();
        
        num.add(6);
        num.add(5);
        num.add(8);
        num.add(2);

        System.out.println(num.get(2));
        System.out.println(num.indexOf(6));
        
        // for(int n: num)
        // {
        //     System.out.println(n);
        // }


    }
}
