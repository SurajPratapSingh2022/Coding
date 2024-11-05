//Sum of all even element store in 1d array using class
class Sum 
{
    private int num[];
    void input(int n[])
    {
        num = n;
    }
    void show()
    {
        System.out.println("Array Elements are ----");
        for(int i=0; i<num.length; i++)
        {
            System.out.println(+num[i]);
        }
    }
    void getSum()
    {
       int s=0;
       for(int i=0; i<num.length; i++)
       {
           if(num[i] % 2 == 0)
           {
               s += num[i];
           }
       }
       System.out.println("Sum is "+s);
    }
}
class Main 
{
    public static void main(String args[])
    {
        int x[]={1,2,3,4};
        Sum obj = new Sum();
        obj.input(x);
        obj.show();
        obj.getSum();
    }
}