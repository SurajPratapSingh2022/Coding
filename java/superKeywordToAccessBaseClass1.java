//example of super keyword to access base class field
class Demo
{
    int x;
}
class Example extends Demo
{
    int x;
    void input(int a, int b)
    {
        x=a;
        super.x = b;
    }
    void show()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
}
class Main 
{
     public static void main (String args [])
     {
         Example e = new Example();
         e.input(100,500);
         e.show();
     }
}