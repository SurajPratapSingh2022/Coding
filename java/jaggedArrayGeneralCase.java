//Jagged Array (General Case) in Java
import java.util.Scanner;
class Main 
{
 public static void main(String args[])
 {
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter row size: ");
    int ro =ob.nextInt();
    int x[][]=new int [ro][];
    for(int i=0; i<x.length; i++)
    {
        System.out.println("Enter Column size of row= "+(i+1));
        int co=ob.nextInt();
        x[i]=new int[co];
    }
    
    for (int i=0;i<x.length;i++)
    {
        System.out.println("enter "+x[i].length+"elements");
        for (int j=0;j<x[i].length;j++) 
        {
            x[i][j]=ob.nextInt();
        }
    }
       System.out.println("all elements of jagged array are :- ");
        for (int i=0;i<x.length;i++) 
        {
            for (int j=0;j<x[i].length;j++) 
            {
              System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
 ob.close();
 }
}