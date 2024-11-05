//display example of Parameterized Constructor
//multiple Constructor within class
class Example
{
    private int x,y;
    Example()
    {
        x = 400;
        y = 100;
    }
    Example (int a)
    {
        x = a;
        y = a;
    }
    Example (int a, int b)
    {
        x = a;
        y = b;
    }
    void show()
    {
        System.out.println("x is "+x+"\n y is "+y);
    }
}
class Main
{
    public static void main(String args[])
    {
        Example e = new Example(100,200);
        e.show();
        Example e1 = new Example(700);
        e1.show();
        Example e2 = new Example();
        e2.show();
    }
}