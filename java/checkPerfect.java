//Check Perfect Number or not
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int sum=0,n=new Scanner(System.in).nextInt();
		/*
		Logic for Perfect Number
		summation of its factor except itself is to that number
		*/
		for(int i=1;i<n;i++)
		{
		    if(n%i==0)
		    sum=sum+i;
		}
		if(sum==n)
		System.out.println("Perfect Number");
		else System.out.println("Not Perfect Number");
	}
}
