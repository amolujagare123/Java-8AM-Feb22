package ArraysDemo;

public class CharArray {

    public static void main(String[] args) {

        char[] ch = new char[5];

        ch[0] ='f';
        ch[1] ='g';
        ch[2] ='!';
        ch[3] ='j';
        ch[4] ='@';


        // length ->istance varible

        /*for (int i=0;i<ch.length;i++)
            System.out.println(ch[i]);*/

        for (char myChar : ch)
            System.out.println(myChar);
    }
}
