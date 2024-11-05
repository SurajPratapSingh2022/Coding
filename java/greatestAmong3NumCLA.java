//print greatest among 3 number using CLA in Java
class Main {
  public static void main(String[] args)
  {
    int n1=Integer.parseInt(args[0]);
    int n2=Integer.parseInt(args[1]);
    int n3=Integer.parseInt(args[2]);
    //By Using Ternary Operator Method
    int temp = n1 > n2 ? n1 : n2;
    int largest = n3 > temp ? n3 : temp;
    System.out.println ("greatest number is "+largest);
    //By Using if-else Method
    if(n1>n2 && n1>n3)
      System.out.println(n1+" is greatest number.");
    else
    {
      if(n2>n3)
        System.out.println(n2+" is greatest number.");
      else System.out.println(n3+" is greatest number.");
    }
    System.out.println("Total argument= "+args.length);
  }
}