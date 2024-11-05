//example of single inheritance to calulate sum in Java
class Num 
{
    int x; 
    private int y;
    void input(int a, int b)
    {
        x=a;
        y=b;
    }
    public void show()
    {
        System.out.println("x is "+x+"\n y is "+y);
    }
    int getY()
    {
        return (y);
    }
}
class Sum extends Num
{
    private int r;
    void getSum()
    {
        r=x+getY();
        System.out.println("Sum is "+r);
    }
}
class Main
{
    public static void main(String args[])
    {
        Sum ss = new Sum();
        ss.input(50,70);
        ss.show();
        ss.getSum();
    }
}










