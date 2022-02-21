package StringDemos;

public class SplitEndswith {

    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";
        String[] stArr = str.split(" ");

        // print only the words that ends with 'y'

        for (int i=0;i< stArr.length;i++) {

            if(stArr[i].endsWith("y"))
                  System.out.println(stArr[i]);
        }
    }
}
