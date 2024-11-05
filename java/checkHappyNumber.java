//Check happy or Unhappy 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		/*
		Logic for Happy Number
		Square of sum of digits of a number .........is equal to 1
		*/
		int sum,n=new Scanner(System.in).nextInt();
		int x=n;
		while (x>=10)
		{
		    	sum=0;
		    	while(x>0)
		    {
		         int r=x%10;
		         sum=sum+r*r;
		         x=x/10;
		    }
		    System.out.printf(sum+" ");
		    x=sum;
		}
    	if(x==1)
		     System.out.println("\nHappy Number");
		else 
		     System.out.println("\nNot Happy Number");
	}
}