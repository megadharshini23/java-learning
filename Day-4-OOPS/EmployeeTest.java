class Employee {   //Two class
    String name;
    int id;
    double salary;
    
    public void show()
    {
         System.out.println("Employeee name : " + name);
         System.out.println("Employeee name : " + id);
         System.out.println("Employeee name : " + salary);
    }

    public void work()
    {
        System.out.println("Employee is working.");
    }
    public void company()
    {
        System.out.println("TCS");
    }
}
public class EmployeeTest{
public static void main(String[] args)
{
    Employee e1 = new Employee();
    Employee e2 = new Employee();
    e1.name="MEGA";
    e1.id=606;
    e1.salary=60000;
    e1.show();
    e1.work();
    e1.company();
    e2.name="madhesh";
    e2.id=707;
    e2.salary=100000;
    e2.show();
    e2.work();
    e2.company();
    
}
}