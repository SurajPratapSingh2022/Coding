//Passing 1-d array from non static function within class in Java
class Main 
{
    void prod(int a[])
    {
        int p=1;
        for(int i=0; i<a.length; i++)
        {
            p*=a[i];
        }
        System.out.println("Product is "+p);
    }
    public static void main(String args[])
    {
        int x[]={5,2};
        // Main obj=new Main();
        // obj.prod(x);
        new Main().prod (x);
    }
}
