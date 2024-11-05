//Sqaure Pattern in Java
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
		        System.out.printf("*");
		    }
		    System.out.println(" ");
		}
	}
}
