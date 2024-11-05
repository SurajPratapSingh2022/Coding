//Print greatest among 3 number using class
class Great
{
    private int n1, n2, n3;
    void input(int num1, int num2, int num3)
    {
        n1 = num1;
        n2 = num2;
        n3 = num3;
    }
    void show()
    {
        if(n1>n2 && n1>n3)
        {
            System.out.println(n1+" is greatest number");
        }
        else 
        {
            if(n2>n3)
            {
                System.out.println(n2+" is greatest number");
            }
            else
            {
                System.out.println(n3+" is greatest number");
            }
        }
    }
}
class Main 
{
    public static void main(String args[])
    {
        Great g1 = new Great();
        g1.input(3,4,5);
        g1.show();
        Great g2 = new Great();
        g2.input(6,8,7);
        g2.show();
        Great g3 = new Great();
        g3.input(1,2,9);
        g3.show();
    }
}



