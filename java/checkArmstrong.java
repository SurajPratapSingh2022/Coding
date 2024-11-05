import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n=new Scanner(System.in).nextInt();
		int t=n,d=0;
		while(n>0)
		{
		    int r=n%10;
		    d=d+(r*r*r);
		    n=n/10;
		}
		if(t==d)
		System.out.println("Armstrong Number");
		else System.out.println("Not Armstrong Number");
	}
}
