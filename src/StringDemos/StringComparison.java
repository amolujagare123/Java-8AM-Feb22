package StringDemos;

public class StringComparison {

    public static void main(String[] args) {

     /*   int a =20;
        int b =20;

        System.out.println(a==b);
*/

        String str1 = "amol";
        String str2 = "amol";
        String str3 = "Amol";
        String str4 = "abcd";
        String str5 = new String("amol");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));

        System.out.println(str1==str2);

    }
}
