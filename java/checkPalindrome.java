//Check Palindrome or Not
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		/*
		Logic for Palindrome Number
		Reversing Number is equal to its Actual Number
		*/
		int n=new Scanner(System.in).nextInt();
		int d=0,t=n;
		while(n>0)
		{
		    int r=n%10;
		    d=d*10+r;
		    n=n/10;
		}
		if(d==t)
		System.out.println("Palindrome Number");
		else System.out.println("Not Palindrome Number");
	}
}
