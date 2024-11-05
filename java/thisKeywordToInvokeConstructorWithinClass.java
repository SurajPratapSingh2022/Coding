//this keyword to invoke a constructor within class in Java3
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
        this(500);    //call parametrized constructor
    }
    DemoConsThis(int a)
    {
        x=y=a;
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


