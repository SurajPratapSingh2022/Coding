//Example of class with private access modifier
class DemoFirst
{
	private int x,y;
	void input (int a, int b)
	{
	    x=a;
	    y=b;
	}
	public void show()
	{
	    System.out.println("x is "+x+"\n y is "+y);
	}
	void sum()
	{
	    int s;
	    s=x+y;
	    System.out.println("Sum is "+s);
	}
}
class Main
{
    public static void main(String args[])
    {
        DemoFirst df = new DemoFirst();
        df.input(50,70);
        df.show();
        df.sum();
    }
}
