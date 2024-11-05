//this keyword to invoke a constructor within class
class DemoConsThis
{
    private int x,y;
    DemoConsThis(int a, int b)
    {
        this(); //Call no argument constructor first
        x = a;
        y = b;
    }
    DemoConsThis()
    {
        System.out.println("Hi.........");
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
        DemoConsThis d = new DemoConsThis(50,70);
        d.show();
    }
}




