//Check Spy or not
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		/*
		Logic for Spy Number
		Sum of all digits of a number is equal to product of all digits of a number
		*/
		int d=0,p=1,n=new Scanner(System.in).nextInt();
		while(n>0)
		{
		    int r=n%10;
		    d=d+r;
		    p=p*r;
		    n=n/10;
		}
		if(d==p)
		System.out.println("Spy Number");
		else System.out.println("Not Spy Number");
	}
}