//Find sum using Variable Argument in Java
class Main
{
    static void sum(int...x)
    {
        int s=0;
        for(int a:x)
        {
            s+=a;
        }
        System.out.println("Sum is "+s);
    }
    public static void main(String...args)
    {
        sum(10,20);
        sum(1,2,3,4,5);
    }
}