//Example of Non Static function in Java
/*
//Non static function and main() function specified in different class
class Demo
{
    void sum(int a,int b)
    {
        System.out.println("Sum is "+(a+b));
    }
}
class Main 
{
    public static void main(String args[])
    {
        // Demo obj=new Demo();
        // obj.sum(20,30);
        new Demo().sum(20,30);
    }
}
*/
//Non static function and main() function specified in same class
class Main
{
    void sum(int a, int b)
    {
        System.out.println("Sum is "+(a+b));
    }
    public static void main(String args[])
    {
        // Main dd=new Main();
        // dd.sum(200,300);
        new Main().sum(7,3);
    }
}