import java.util.Scanner;
public class employee
{
	public static void main(String[] args) 
	{
		// Create a Scanner object to read input.
		Scanner scan=new Scanner(System.in);
		
		 // Get the employee's name
        System.out.print("Enter name: ");
        String name = scan.nextLine();
		System.out.println("My name is "+name);
        System.out.println("  ");
        
        // Get the employee's age
        System.out.print("Enter age: ");
		int age=scan.nextInt();
		System.out.println("Age is " +age);
        System.out.println("  ");
        
        // Get the employee's gender
        System.out.print("Enter gender: ");
        char gender = scan.next().charAt(0);
        System.out.println("Gender is " +gender);
        System.out.println("  ");
        
        // Get the employee's salary
        System.out.print("Enter salary: ");
        double salary = scan.nextDouble();
        System.out.println("Salary is " +salary);
	}
}

