import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n1,n2,x=0,y=0;
		n1=new Scanner(System.in).nextInt();
		n2=new Scanner(System.in).nextInt();
		/*
		logic for Amicable Number
		sum of factor of first number (except itself) is equal to the second number viceversa
		*/
		for(int i=1;i<n1;i++)
		{
		    if(n1%i==0)
		    {
		        x=x+i;
		    }
		}
		for(int j=1;j<n2;j++)
		{
		    if(n2%j==0)
		    {
		        y=y+j;
		    }
		}
		if(x==n2 && y==n1)
		System.out.println("Amicable Number");
		else
		System.out.println("Not Amicable Number");
	}
}
