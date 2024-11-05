//Example of resolving name hiding problem using this keyword
class ThisDemo
{
    private int x,y;
    void input(int x, int y)
    {
        // x = x;    //output- x is 0
        // y = y;    //output- x is 0
        this.x = x;
        this.y = y;
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
        ThisDemo td = new ThisDemo();
        td.input(50,70);
        td.show();
    }
}