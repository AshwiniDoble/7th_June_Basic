package Com.Collection01.LinkedHashSet0;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        //LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
        //HashSet lset = new HashSet();
        LinkedHashSet lset = new LinkedHashSet<>();
        

        lset.add(100);
        lset.add(200);
        lset.add(300);
        lset.add(400);
        lset.add(500);


        System.out.println(lset);

    }
}
