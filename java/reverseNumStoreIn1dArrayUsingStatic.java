//wap to reverse number store in 1d array by using static function
import java.util.*;
class Main
{
  static void reverse (int a[])
  {
    for (int i = 0; i < a.length; i++)
      {
	    int rev = 0;
	    while (a[i] != 0)
	       {
	          int r = a[i] % 10;
	          rev = rev * 10 + r;
	          a[i] = a[i] / 10;
	       }
	   a[i] = rev;
      }
    System.out.println ("Array in reverse order:");
    for (int i = a.length - 1; i >= 0; i--)
      {
	      System.out.println (a[i] + " ");
      }
  }
  public static void main (String args[])
  {
      Scanner ob=new Scanner(System.in);
      int row = ob.nextInt();
      int x[]=new int[row];
      System.out.println("enter 5 element");
      for( int i=0;i<x.length;i++)
      {
          x[i]=ob.nextInt();
      }
      //int x[]=new int[] {2,3,5};
      reverse (x);
  }
}
