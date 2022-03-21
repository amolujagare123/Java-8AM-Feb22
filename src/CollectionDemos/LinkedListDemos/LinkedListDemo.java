package CollectionDemos.LinkedListDemos;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("Ashish");
        ll.add("Amol");
        ll.add("Kiran");
        ll.add("Ankita");
        ll.add("Nirmala");
        ll.add("rani");
        ll.add("sarita");
        ll.add("ravi");
        ll.add("Raj");
        ll.add("avinash");

        System.out.println(ll);

        ll.addFirst("first");
        ll.addLast("last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
