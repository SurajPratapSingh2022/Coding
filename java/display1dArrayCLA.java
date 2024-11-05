//Inputing & display 1d array Using CLA in Java
public class Main 
{
  public static void main(String[] args)
    {
        int x[]=new int[args.length];
        //cmd inputting or CLA logic
        for(int i=0; i<args.length; i++)
         {
            x[i] = Integer.parseInt(args[i]);
         }
         System.out.println("All elements are");
         // Using for-each Loop
        for (int a:x)
          {
             System.out.println(a);
          }
        // Using for loop
        //for (int i=0; i<x.length; i++)
        //  {
        //   System.out.println(x[i]);
        //  }
    }
}