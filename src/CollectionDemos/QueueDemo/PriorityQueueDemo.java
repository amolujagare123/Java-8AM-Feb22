package CollectionDemos.QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(23);
        pq.offer(53);
        pq.offer(20);
        pq.offer(63);
        pq.offer(21);
        pq.offer(13);

        System.out.println(pq);
        // 13,20,21,23,53,63

        // some os / compilers does not support priority que

        System.out.println(pq.poll()); // 13
        System.out.println(pq.poll()); // 20
        System.out.println(pq.poll()); // 21
        System.out.println(pq.poll()); // 23
        System.out.println(pq.poll()); // 53
        System.out.println(pq.poll()); // 63



    }
}
