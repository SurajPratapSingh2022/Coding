//Sum of all odd element store in 2d array
import java.util.Scanner;
class Sum 
{
    void f1(int a[][])
    {
           int s=0;
           for(int i=0; i<a.length; i++)
           {
               for(int j=0; j<a[i].length; j++)
               {
                   if(a[i][j]%2!=0)
                    {
                        s+=a[i][j];
                    }
               }
           }
        System.out.println("Sum of Odd number store in array is "+s);
    }
}
class Main 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        //Logic for taking size
        System.out.println("Enter size of 2d array: ");
        int size1= obj.nextInt();
        int size2= obj.nextInt();
        int x[][]=new int[size1][size2];
        //Logic for inputing
        System.out.println("Now Element inputing:----------");
        for(int i=0; i<x.length; i++)
        {
            for(int j=0; j<x[i].length; j++)
            {
                x[i][j]=obj.nextInt();
            }
        }
        new Sum().f1(x);
        // Sum obj=new Sum();
        //obj.f(x);
    }
}

