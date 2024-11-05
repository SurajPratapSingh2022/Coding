//Check number is Strong or Weak
import java.util.Scanner;
class Main
{
	public static void main(String args [])
	{
		 int n=new Scanner(System.in).nextInt();
		 int t=n,sum=0;
		 /*Logic for Strong Number
		 Summation of factorial of each digit is equal to that number
		 */
		 while(n>0)
		 {
		 	int r=n%10; //For last digit
		 	n=n/10;     //For new number
		 	//Logic of Fatorial
		 	int prod=1;
		 	for(int j=1; j<=r; prod*=j, j++);
		 	sum=sum + prod;
		 }
		 if(sum==t)
		 System.out.println("\nStrong Number");
		 else System.out.println("\nWeak Number");
	} 
}