package StaticFinal;

public class Student {
    int rno;
    String name;
    static String college="ITC";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rno =1;
        s1.name="Ashwini";
        s1.college ="XYZ";

        s1.display();

        Student s2 = new Student();

        s2.rno =2;
        s2.name="Kalyani";
        s2.college = "ABCD";

        Student s3 = new Student();

        s3.rno =3;
        s3.name="Mandar";
        s3.college ="PICT";

        Student.college = "Pune college";

        s1.display();
        s2.display();
        s3.display();
    }
}
