//class example with protected access modifier
class DemoFirst
{
    protected int x,y;
}
class Main
{
    public static void main(String args[])
    {
        DemoFirst f = new DemoFirst();
        f.x=10;
        f.y=25;
        System.out.println(f.x);
        System.out.println(f.y);
        System.out.println(f.x+f.y);
    }
}