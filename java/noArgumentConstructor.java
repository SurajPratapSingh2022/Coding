//print number Example of No Argument constructor
class Main
{
    private int x , y;
    Main()
    {
        x=50;
        y=100;
    }
    void show()
    {
        System.out.println("x is "+x+"\n y is "+y);
    }
    public static void main(String args[])
    {
        Main d = new Main();
        d.show();
    }
}