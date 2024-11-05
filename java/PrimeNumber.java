import java.util.Scanner;
class PrimeNumber
{
	public static void main(String args [])
	{
		 int n=new Scanner(System.in).nextInt();
		 for(int i=0; i<=n; i++)
		 {
		 	int d=0;
		 	if(n%i==0)
		 		{
		 			System.out.printf(i+" ");
		 			d=d+i;
		 		}
		 		/*
		 		if(d==n)
		 			System.out.println("Strong Number");
		 		else System.out.println("Weak Number");
		 		*/
		 }
	} 
}