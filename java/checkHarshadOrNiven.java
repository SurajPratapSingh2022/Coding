//Check Hashed/Niven or Not
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		/*
		Logic for Hashed/Niven Number
		Completely Divisible by sum of all digits
		*/
		int t,sum=0,n=new Scanner(System.in).nextInt();
		t=n;
		while(n>0)
		{
		    int r=n%10;
		    sum+=r;
		    n=n/10;
		}
		if(t%sum==0)
		System.out.println("Hashed/Niven Number");
		else System.out.println("Not Harshed/Niven Number");
	}
}
