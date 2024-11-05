//Check Magic Number or not 
import java.util.Scanner;
public class Main
{
  public static void main (String args[])
  {
    int remainder = 1, number, sum = 0;
    int n=new Scanner(System.in).nextInt();
    /*
    Logic for Magic Number
    Net single result of addition of all digits of a number is equal to 1
    */
    number = n;
    while (number > 9)
      {
       	while (number > 0)
    	  {
      	    remainder = number % 10;
    	    sum = sum + remainder;
    	    number = number / 10;
    	  }
    	number = sum;
    	sum = 0;
      }
    if (number == 1)
	System.out.println ("Magic Number");
    else
	System.out.println ("Not Magic Number");
  }
}