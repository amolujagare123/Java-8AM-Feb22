public class IncDecDemo {

    public static void main(String[] args) {

        /*i++ , i--  : here first statement is executed then
        increment or decrement happens

        ++i , - - i : here first increment or decrement happens then
         statement is executed
*/
        int a= 10;

        System.out.println(a); // 10
        System.out.println(a++); // 10
        System.out.println(a);// 11
        System.out.println(++a); // 12
        System.out.println(a);//12


    }
}
