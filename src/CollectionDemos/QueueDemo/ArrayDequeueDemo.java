package CollectionDemos.QueueDemo;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

    public static void main(String[] args) {

        ArrayDeque<String> adq = new ArrayDeque<>();

        adq.offer("Ashish");
        adq.offer("Amol");
        adq.offer("Kiran");
        adq.offer("Ankita");
        adq.offer("Nirmala");

        System.out.println(adq);

        adq.offerFirst("first");
        adq.offerLast("last");

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);


    }
}
