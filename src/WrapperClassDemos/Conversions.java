package WrapperClassDemos;

public class Conversions {

    public static void main(String[] args) {

        String str1 = "12";
        String str2 = "34";
        System.out.println(str1+str2); //1234

        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);

        System.out.println(i1+i2); //46

        String str3 = "34.12";
        String str4 = "11.34";

        double d1 = Double.parseDouble(str3);
        double d2 = Double.parseDouble(str4);

        System.out.println(d1+d2);

        float f1= Float.parseFloat(str3);
        float f2= Float.parseFloat(str4);

        System.out.println(f1+f2);

        String str5 = "false";

        boolean result = Boolean.parseBoolean(str5);

        if (result)
            System.out.println("result is true");
        else
            System.out.println("result is false");



        String str6 = "l";
        char ch = str6.charAt(0);



         int i =10;

        String str = i+"";
        System.out.println("str="+10);





    }
}
