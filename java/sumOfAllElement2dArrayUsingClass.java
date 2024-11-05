//Sum of all element store in 2d array using class
class Sum 
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
    void getSum()
    {
       int s=0;
       for(int i=0; i<num.length; i++)
        {
            for(int j=0; j<num[i].length; j++)
            {
                s += num[i][j];
            }
        }
       System.out.println("Sum is "+s);
    }
}
class Main 
{
    public static void main(String args[])
    {
        int x[][] = {{10,5},{2,3}};
        Sum obj = new Sum();
        obj.input(x);
        obj.show();
        obj.getSum();
    }
}