package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveIf4 {

    public static void main(String[] args) {


        ArrayList<Character> al = new ArrayList<>();

        al.add('a');
        al.add('b');
        al.add('c');
        al.add('d');
        al.add('e');
        al.add('f');
        al.add('g');
        al.add('h');
        al.add('i');
        al.add('j');
        al.add('k');
        al.add('l');
        al.add('m');
        al.add('n');
        al.add('o');
        al.add('p');

//     al.removeIf(str -> str.length()<5);

        System.out.println("al="+al);
        // 1. identify the type of the list
        // 2. choose a variable ( no need to specify its type)
        // this variable will represent each item of the list
        // 3. use predicate symbol ( -> )
        // 4. write the condition

        // remove the elements whose length is less than 5

        al.removeIf(ch-> (ch == 'a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ));

        System.out.println("al="+al);





    }
}
