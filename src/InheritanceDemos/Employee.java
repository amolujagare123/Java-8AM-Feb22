package InheritanceDemos;

public class Employee {

    int salary = 20000;

    void displayEmployeeWork()
    {
        System.out.println("Employee work");
    }
}

class Programmer extends Employee
{
    int bonus = 5000;
    void displayProgrammerWork()
    {
        System.out.println("Programmer work");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.bonus);
        p.displayProgrammerWork();

        System.out.println(p.salary);
        p.displayEmployeeWork();
    }
}