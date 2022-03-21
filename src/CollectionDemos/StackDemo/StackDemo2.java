package CollectionDemos.StackDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(12); // 6
        s.push(32); // 5
        s.push(42); // 4
        s.push(10); // 3
        s.push(17); // 2
        s.push(92); // 2

        System.out.println(s);

        System.out.println(s.search(32));

        s.push(100); // 1


    }
}
