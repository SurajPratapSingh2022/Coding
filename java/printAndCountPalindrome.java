//Print & Count Palindrome Number num1 to num2 (where num1 < num2)
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		/*
		Logic for Palindrome Number
		Reversing Number is equal to its Actual Number
		*/
		int num1=new Scanner(System.in).nextInt();
		int num2=new Scanner(System.in).nextInt();
		int cnt=0;
		for(int n=num1;n<num2;n++)
		{
		    //Logic for Reverse Number
		    int d=0,t=n;
		    while(t>0)
		     {
		         int r=t%10;
		         d=d*10+r;
		         t=t/10;
	      	}
	    	if(d==n)
	     	{
		        System.out.printf(d+" ");
		        cnt++;
	     	}
	     	d=0;
		}
		System.out.println("\n"+cnt);
	}
}
