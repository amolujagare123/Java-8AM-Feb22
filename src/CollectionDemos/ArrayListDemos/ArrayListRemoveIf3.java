package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveIf3 {

    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<>();

        al.add(344);
        al.add(243);
        al.add(144);
        al.add(342);
        al.add(534);
        al.add(856);
        al.add(111);
        al.add(980);

//     al.removeIf(str -> str.length()<5);

        System.out.println("al="+al);
        // 1. identify the type of the list
        // 2. choose a variable ( no need to specify its type)
        // this variable will represent each item of the list
        // 3. use predicate symbol ( -> )
        // 4. write the condition

        // remove the elements whose length is less than 5

        al.removeIf(a -> a%2!=0);

        System.out.println("al="+al);





    }
}
