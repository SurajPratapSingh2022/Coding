//Find & Count Armstrong Number num1 to num2 (where num1 < num2)
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		/*
		Logic of Armstrong Number
		Summation of cube each digit of a number is equal to the number
		*/
		int num1=new Scanner(System.in).nextInt();
		int num2=new Scanner(System.in).nextInt();
		int cnt=0;
		for(int n1=num1; n1<=num2; n1++)
		{
		    int n2=n1,d=0;
		    while(n2>0)
		    {
		        int r=n2%10;
		        d=d+r*r*r;
		        n2=n2/10;
		    }
		    if(d==n1)
		    {
		        System.out.printf(n1+" ");
		        cnt++;
		    }
		    d=0;
		}
		System.out.println("\nTotal count is "+cnt);
	}
}