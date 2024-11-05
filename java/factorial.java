import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    /*
	    Logic for Factorial
	    multiplication of all previous positive number (i.e. from 1) from that number
	    */
	    int prod=1,n=new Scanner(System.in).nextInt();
		for(int i=1; i<=n; prod*=i, i++);
		System.out.println(prod);
	}
}