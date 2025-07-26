package Com.Collection01.Queue0;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo0 {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue<>();

        q.add("A");
        q.add("B");
        q.add("C");
        q.offer("C");

        System.out.println(q); //[A, B, C, C] - insertion order preserved, duplicates are allowed

        //get head element --> element() and peek()
        // System.out.println(q.element());
        // System.out.println(q.peek());

        //RETURN the head element and remove --> remove()  and  poll()
        // System.out.println(q.remove());
        // System.out.println(q);

        // System.out.println(q.poll());
        // System.out.println(q);
        
        /*Iterator itr = q.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }*/

        for(Object e: q)
        {
            System.out.println(e);
        }


    }
}
