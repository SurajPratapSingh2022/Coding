//Example of this keyword
class ThisDemo
{
    private int x,y;
    void input(int a, int b)
    {
        this.x = a;
        this.y = b;
    }
    void show()
    {
        System.out.println("x is "+this.x+"\n y is "+this.y);
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


