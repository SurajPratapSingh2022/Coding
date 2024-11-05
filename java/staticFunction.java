//Example of Static Function in Java
/*
//Both static function & main() function specified in same class
class Main
{
  static void sum(int a,int b)
  {
      System.out.println("Sum is "+(a+b));
  }
  public static void main(String args[])
  {
      sum(100,200);       //valid
      Main.sum(500,200);  //valid
  }
}*/
//Both static function & main() function specified in same class
class Demo
{
    static void sum(int a, int b)
    {
        System.out.println("Sum is "+(a+b));
    }
}
class Main
{
    public static void main(String args[])
    {
        //sum(100,200);   //error 
        Demo.sum(500,300); //valid
    }
}
