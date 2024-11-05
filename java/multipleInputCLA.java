//cmd multiple input: CLA in Java
public class Main
{
  public static void main(String args[])
  {
      System.out.println("Total argument= "+args.length);
      System.out.println("All argument are:-----");
      for(int i=0; i<args.length; i++)
      {
          System.out.println(args[i]);
      }
  }
}