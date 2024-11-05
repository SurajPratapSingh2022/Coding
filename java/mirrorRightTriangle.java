//Mirror Right Angle Triangle- Pattern Printing in Java
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
		        if(i==n || j==n || j==n-i+1)
		        System.out.printf("*");
		        else System.out.print(" ");
		    }
		    System.out.print("\n");
		}
	}
}