//example of multiple inheritance
class Num1
{
    private int x;
    void input(int a)
    {
        x = a;
    }
    public void show()
    {
        System.out.println("x is "+x);
    }
    int getX()
    {
        return(x);
    }
}
class Num2 extends Num1
{
    private int y;
    void getData(int a)
    {
        y = a;
    }
    void display()
    {
        System.out.println("y is "+y);
    }
    int getY()
    {
        return(y);
    }
}
class Sum extends Num2
{
    private int r;
    void getSum()
    {
        r = getX() + getY();
        System.out.println("Sum is "+r);
    }
}
class Main 
{
    public static void main(String args[])
    {
        Sum ss = new Sum();
        ss.input(50);
        ss.getData(150);
        ss.show();
        ss.display();
        ss.getSum();
    }
}














