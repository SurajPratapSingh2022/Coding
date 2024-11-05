//example of super keyword to access base class
class Demo
{
    void show()
    {
        System.out.println("Hello base Demo");
    }
}
class Example extends Demo
{
    void show()
    {
        System.out.println("Hello derive Example");
        super.show();
    }
}
class Main 
{
    public static void main(String args[])
    {
        Example e = new Example();
        e.show();
    }
}