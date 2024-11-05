//Prog. to store & display 3 employee details from array of object
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
        Employee e[] = new Employee[3];
        for(int i=0; i<e.length; i++)
        {
            e[i] = new Employee();
        }
        System.out.println("Enter details of 3 employee: ");
        for(int i=0; i<e.length; i++)
        {
            e[i].input();
        }
        System.out.println("All employee details -----");
        for(int i=0; i<e.length; i++)
        {
            e[i].show();
        }
    }
}
