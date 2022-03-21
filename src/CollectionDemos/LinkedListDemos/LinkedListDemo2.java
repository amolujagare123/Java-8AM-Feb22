package CollectionDemos.LinkedListDemos;

import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(12);
        ll.add(42);
        ll.add(15);
        ll.add(15);
        ll.add(42);
        ll.add(72);

        System.out.println(ll);

        ll.add(72);

       ll.set(2,56);

        System.out.println(ll);

        ll.remove(new Integer(12));
        System.out.println(ll);
    }
}
