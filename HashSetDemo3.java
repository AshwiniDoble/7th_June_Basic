package Com.Collection01.HashSet0;

import java.util.HashSet;

public class HashSetDemo3 {
    public static void main(String[] args) {
        //Uninon, intersection and difference
        HashSet <Integer> set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("HashSet 1 = " + set1); // HashSet 1 = [1, 2, 3, 4, 5]

        HashSet <Integer> set2 = new HashSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("HashSet 2 = " + set2); // HashSet 2 = [3, 4, 5]

        //Union
        // set1.addAll(set2);
        // System.out.println("Union: "+ set1); // [1, 2, 3, 4, 5]

        // //intersection

        // set1.retainAll(set2);
        // System.out.println("intersection: " + set1); //intersection: [3, 4, 5]

        //Difference
        set1.removeAll(set2);
        System.out.println("Difference : "+ set1);

        //SubSet
        set1.containsAll(set2);
        System.out.println("SubSet: "+ set1);

    }
}
