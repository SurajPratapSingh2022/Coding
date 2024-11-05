//Jagged Array (Specific Case:- RightAngleTriangle) in Java
import java.util.Scanner;
class Main 
{
 public static void main(String args[])
 {
    Scanner ob=new Scanner(System.in);
    int x[][]=new int[5][5];
    for(int i=0; i<x.length; i++)
        x[i]=new int[i+1];
    
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