package CollectionDemos.StackDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        System.out.println(s.empty()); // true

        s.push(12);
        s.push(32);
        s.push(42);
        s.push(10);
        s.push(17);
        s.push(92);

        System.out.println(s.empty()); // false
        System.out.println(s);

       // System.out.println(s.pop());
        // returns and removes the element at the top of the stack

       // System.out.println(s.peek());
        // returns the element at the top of the stack (does not removes)


        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        System.out.println(s);
    }
}
