package ArraysDemo;

public class StringArray {

    public static void main(String[] args) {

        String[] stArr = new String[10];

        stArr[0] ="Amar";
        stArr[1] ="Abhishek";
        stArr[2] ="Ashish";
        stArr[3] ="Nirmala";
        stArr[4] ="Dhivya";

        int l = stArr.length;

        System.out.println("length="+l);
        System.out.println("length="+stArr.length);

        for (int i=0;i<stArr.length;i++)
            System.out.println(stArr[i]);

    }
}
