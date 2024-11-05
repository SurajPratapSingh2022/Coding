//Hollow Rhombus Shape with upper point attach- Pattern Printing in Java
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    //For accurate mid point always required a odd number
		System.out.print("Enter number: ");
		int n=new Scanner(System.in).nextInt();
		System.out.println("Our pattern is ---- \n");
		for(int i=1; i<=n; i++)
		{
		    //For Space
		    for(int k=1; k<=i-1; k++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1; j<=n; j++)
		    {
		        if(i==1 || i==n || j==1 || j==n)
		        {
		            System.out.print("*");
		        }
		        else System.out.print(" ");
		    }
		    System.out.print("\n");
		}
	}
}