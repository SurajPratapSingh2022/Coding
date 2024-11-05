//Product of each element store in 1d array using class
import java.util.Scanner;
class Prod 
{
    private int num[];
    void input(int n[])
    {
        num = n;
    }
    void show()
    {
        System.out.println("Array Elements are ----");
        for(int i=0; i<num.length; i++)
        {
            System.out.println(+num[i]);
        }
    }
    void getProd()
    {
       int p=1;
       for(int i=0; i<num.length; i++)
       {
           p *= num[i];
       }
       System.out.println("product is "+p);
    }
}
class Main 
{
    public static void main(String args[])
    {
        int x[]={1,2,3};
        Prod obj = new Prod();
        obj.input(x);
        obj.show();
        obj.getProd();
    }
}