package StringDemos;

public class SplitDemo3 {

    public static void main(String[] args) {
        String str = "He told that we have to stay together in order to escape";
        // Print the words that have ‘o’ at index 1.
        String[] stArr = str.split(" ");


        for (int i=0;i<stArr.length;i++) {

            if(stArr[i].charAt(1)=='o')
              System.out.println(stArr[i]);
        }
    }
}
