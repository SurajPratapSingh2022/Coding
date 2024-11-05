//Product of diagonal element in 2d array using class
class Dia 
{
    private int num[][];
    void input(int n[][])
    {
        num = n;
    }
    void show()
    {
        System.out.println("Array Elements are ----");
        for(int i=0; i<num.length; i++)
        {
            for(int j=0; j<num[i].length; j++)
            {
                System.out.println(num[i][j]);
            }
        }
    }
    void getProd()
    {
       int p=1;
       for(int i=0; i<num.length; i++)
        {
            for(int j=0; j<num[i].length; j++)
            {
                if(i==j)
                {
                    p *= num[i][j];
                }
            }
        }
       System.out.println("Product is "+p);
    }
}
class Main 
{
    public static void main(String args[])
    {
        int x[][] = {{10,5},{2,3}};
        Dia obj = new Dia();
        obj.input(x);
        obj.show();
        obj.getProd();
    }
}