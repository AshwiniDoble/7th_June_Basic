package Com.Collection01.Queue0;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueDemo1 {
    public static void main(String[] args) {
        LinkedList q = new LinkedList();

        q.add("A");
        q.add("B");
        q.add("C");
        q.offer(100);
        q.offer("C");

        // System.out.println(q); // insertion order maintained, duplicates are allowed, heterogenious data allowed

        // // To get the head element element() and peek()

        // System.out.println(q.element());
        // System.out.println(q.peek());

        // // to RETURN and remove the head element remove() and poll()

        // System.out.println(q.remove());
        // System.out.println(q.poll());

        // Iterator itr = q.iterator();
        // while (itr.hasNext())
        // {
        //     System.out.println(itr.next());
        // }

        for(Object e:q)
        {
            System.out.println(e);
        }
    }
}
