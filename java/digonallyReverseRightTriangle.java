//Digonally Reverse Right Angle Triangle- Pattern Printing in Java
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n=new Scanner(System.in).nextInt();
		System.out.println("Our pattern is ---- ");
		for(int i=1; i<=n; i++)
		{
		    for(int j=1; j<=n; j++)
		    {
		        if(i==1 || j==n || i==j)
		        System.out.printf("*");
		        else System.out.print(" ");
		    }
		    System.out.print("\n");
		}
	}
}