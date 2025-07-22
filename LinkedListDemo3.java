package Com.Collection01.LinkedList0;

import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        
        LinkedList l = new LinkedList();
        l.add("Dog");
        l.add("Dog");
        l.add("Cat");
        l.add("Horse");

        System.out.println(l); //[Dog, Dog, Cat, Horse]
        l.addFirst("Tiger");
        l.addLast("Elephant");

        System.out.println("After adding new elements: "+ l); //[Tiger, Dog, Dog, Cat, Horse, Elephant]

        System.out.println(l.getFirst());//Tiger
        System.out.println(l.getLast()); //Elephant

        l.removeFirst();
        l.removeLast();
        System.out.println("After removing first and last element: "+ l);
    }
}
