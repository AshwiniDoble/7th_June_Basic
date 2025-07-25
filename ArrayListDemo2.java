package Com.Collection01.ArrayList0;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        ArrayList al_dup = new ArrayList();
        al_dup.addAll(al);
        System.out.println(al_dup); // [X, Y, Z, A, B, C]

        al_dup.removeAll(al);
        System.out.println("removing elements: " + al_dup);

        //Sort --- Collections.sort()

        System.out.println("Elements in AarrayList: " + al);
        Collections.sort(al);
        System.out.println("After sorting: " + al);

        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Elements in the array list after sorting in reverse order: " + al);

        //shuffling --- Collections.shuffle()
        Collections.shuffle(al);
        System.out.println("After shuffling: "+ al);
    }
}
