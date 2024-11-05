//Sum of all odd element store in 1d array
class Sum 
{
    void f1(int a[])
    {
           int s=0;
           for(int i=0; i<a.length; i++)
           {
               if(a[i]%2!=0)
               {
                   s+=a[i];
               }
           }
        System.out.println("Sum of Odd number store in array is "+s);
    }
}
class Main 
{
    public static void main(String args[])
    {
        int x[]={2,3,7};
        new Sum().f1(x);
    }
}