//Prog. to store & display 3 employee details
import java.util.Scanner;
class Employee
{
    private String name, address;
    private int eid, salary;
    void input()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = obj.nextLine();
        System.out.print("Enter id: ");
        eid = obj.nextInt();
        obj = new Scanner(System.in);     //Creating fresh object (i.e. in c++ use fflush(stdin) )
        
        System.out.print("Enter address: ");
        address = obj.nextLine();
        System.out.print("Enter salary: ");
        salary = obj.nextInt();
    }
    void show()
    {
        System.out.println("Name is "+name);
        System.out.println("id is "+eid);
        System.out.println("Address is "+address);
        System.out.println("Salary is "+salary);
    }
}
class Main 
{
    public static void main(String args[])
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.input();
        e2.input();
        e3.input();
        System.out.println("All Employee details are -------");
        e1.show();
        e2.show();
        e3.show();
    }
}
