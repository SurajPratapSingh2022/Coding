//Sum of elements with user inputing in 1d Array from Java
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner ob=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int siz = ob.nextInt();
		int x[] = new int[siz];
		System.out.println("Enter"+siz+"elementes");
		for(int i=0; i<x.length; i++)
		{
		    x[i]=ob.nextInt();
		}
		int s=0;
		System.out.println("All elements are:--");
		for(int i=0; i<x.length; i++)
		{
		    System.out.println(x[i]);
		    s+=x[i];
		}
		System.out.println("Sum is "+s);
		ob.close();
	}
}

