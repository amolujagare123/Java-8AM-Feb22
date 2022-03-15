package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveClear {

    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList<>();

        al.add("Ashish");
        al.add("Ashish");
        al.add("Amol");
        al.add("Kiran");
        al.add("Ankita");
        al.add("Nirmala");

        System.out.println("al="+al);

      //  al.clear();


        ArrayList<String> al2 = new ArrayList<>();

        al2.add("Ashish");
        al2.add("Ashish");
        al2.add("Amol");
        al2.add("abc1");
        al2.add("abc2");
        al2.add("abc3");


        System.out.println("al2="+al2);

        al2.removeAll(al);
        // remove all the elements from al2 which are common in al
        System.out.println("al2="+al2);



    }
}
