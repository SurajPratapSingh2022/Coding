//Jagged Array (Specific Case) in Java
import java.util.Scanner;
class Main 
{
 public static void main(String args[])
 {
    int x[][]=new int[5][];
    x[0]=new int[2];
    x[1]=new int[3];
    x[2]=new int[5];
    x[3]=new int[2];
    x[4]=new int[4];
    Scanner obs = new Scanner(System.in);
    for (int i=0;i<x.length;i++) 
    {
        System.out.println("enter "+x[i].length+"elements");
        for (int j=0;j<x[i].length;j++) 
        {
            x[i][j]=obs.nextInt();
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
 obs.close();
 }
}