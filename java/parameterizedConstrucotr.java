//display example of Parameterized Constructor
class Example
{
    private int x,y;
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
    }
}