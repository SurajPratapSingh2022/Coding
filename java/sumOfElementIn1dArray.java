//Sum of elements in 1d Array from Java
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int x[]=new int[5];
		System.out.println("Enter 5 element: ");
		for(int i=0; i<5; i++)
		{
		    x[i]=ob.nextInt();
		}
		int s=0;
		System.out.println("All elements are:-- ");
		for(int i=0; i<x.length; i++)
		{
		    System.out.println(x[i]);
		    s+=x[i];
		}
		System.out.println("Sum is "+s);
		ob.close();
	}
}
