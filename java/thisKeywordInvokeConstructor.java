//this keyword to invoke a constructor within class in Java2
class DemoConsThis
{
    private int x,y;
    DemoConsThis(int a, int b)
    {
        x = a;
        y = b;
    }
    DemoConsThis()
    {
        this(100,200); //call parametrized constructor
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
        DemoConsThis d = new DemoConsThis();
        d.show();
    }
}


