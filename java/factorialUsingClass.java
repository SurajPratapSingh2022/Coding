//Factorial program using class
import java.util.Scanner;
class Fact
{
    private int num;
    void input(int a)
    {
        num=a;
    }
    void show()
    {
        System.out.println("Number is "+num);
    }
    void getFact()
    {
       int p=1;
       for(int i=1; i<=num; i++)
       {
           p *= i;
       }
        System.out.println("Factorial is "+p);
    }
}
class Main 
{
    public static void main(String args[])
    {
        System.out.println("Enter Number: ");
        int x = new Scanner(System.in).nextInt();
        Fact obj = new Fact();
        obj.input(x);
        obj.show();
        obj.getFact();
    }
}



