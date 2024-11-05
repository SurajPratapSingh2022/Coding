//Complex Number using class
// Logical Wrong
import java.util.Scanner;
class Comp 
{
    private String num1, num2;
    void input(String a, String b)
    {
        num1=a;
        num2=b;
    }
    void show()
    {
        System.out.println("Number is "+num1+"\nNumber is "+num2);
    }
}
class Main 
{
    public static void main(String args[])
    {
        System.out.println("Enter Number: ");
        String x = new Scanner(System.in).nextLine();
        String y = new Scanner(System.in).nextLine();
        Comp obj = new Comp();
        obj.input(x,y);
        obj.show();
    }
}

