//Find Fibonacci Series
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n1=0,n2=1,next,n=new Scanner(System.in).nextInt();
		/*
		Logic for Fibonacci Series
		sum of two (i.e. intialy 0 & 1) previous number is equal to the next once
		*/
		for(int i=0;i<n;i++)
		{
		    if(i<=1)
		    next=i;
		    else 
		    {
		        next=n1+n2;
		        n1=n2;
		        n2=next;
		    }
		    System.out.printf(next+" ");
		}
	}
}
