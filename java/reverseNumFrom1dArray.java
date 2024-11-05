//Reverse number from 1d array in Java
import java.util.*;
class Main
{
  public static void main (String args[])
  {
    int x[] = new int[5];
    System.out.println ("enter 5 element");
    //Inputing Logic
    for (int i = 0; i < 5; i++)
      {
	     x[i] = new Scanner(System.in).nextInt ();
      }
    //Reverse Logic
    for (int i = 0; i < x.length; i++)
      {
	    int rev = 0;
	    while (x[i] != 0) //check array is 0 or not
	       {
	          int r = x[i] % 10;
	          rev = rev * 10 + r;
	          x[i] = x[i] / 10;
	       }
	   x[i] = rev;
      }
    System.out.println ("Array in reverse order:");
    for (int i = x.length - 1; i >= 0; i--)
      {
	      System.out.println (x[i] + " ");
      }
  }
}

