//Check spy or not using class
import java.util.Scanner;
class Spy 
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
    void getSpy()
    {
       int i=0, sum=0,prod=1;
        while(num>0)
        {
            int r = num % 10;
            sum += r;
            prod *= r;
            num = num / 10;
            i++;
        }
        System.out.println("Sum is "+sum);
        System.out.println("Product is "+prod);
        if(sum==prod)
        {
            System.out.println("SPY Number");
        }
        else
        {
            System.out.println("Not SPY Number");
        }
    }
}
class Main 
{
    public static void main(String args[])
    {
        System.out.println("Enter Number: ");
        int x = new Scanner(System.in).nextInt();
        Spy obj = new Spy();
        obj.input(x);
        obj.show();
        obj.getSpy();
    }
}


