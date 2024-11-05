//wap to reverse number store in 1d array by using static function with differnt class
class Demo
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
}
class Main
{
  public static void main (String args[])
  {
      int x[]=new int[] {2,3,5};
      Demo.reverse (x);
  }
}