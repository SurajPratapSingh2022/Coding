//Example Static Function
/*
//Find greattest among 3 nos. from static funciton (within same class) in Java
class Main
{
    static int greattest(int a, int b, int c)
    {
        if(a>b && a>c)
            return a;
        else if(b>c)
            return b; 
        else return c;
    }
    public static void main(String args[])
    {
        System.out.println("greattest number is "+greattest(5,2,9));
    }
}

//Find greattest among 3 nos. from static funciton (with different class) in Java
class Grt
{
    static int greattest(int a, int b, int c)
    {
        if(a>b && a>c)
            return a;
        else if(b>c)
            return b; 
        else return c;
    }
}
class Main
{
    public static void main(String args[])
    {
        System.out.println(Grt.greattest(9,2,5)+" is greattest number.");
    }
}
*/
//Example of Non Static Function
/*
//Find greattest among 3 nos. from static funciton (within same class) in Java
class Main 
{
    int greattest(int a, int b, int c)
    {
        if(a>b && a>c)
            return a;
        else if(b>c)
            return b; 
        else return c;
    }
    public static void main(String args[])
    {
        // Main obj=new Main();
        // int x=obj.greattest(3,7,6);
        //int x=new Main().greattest(3,7,6);
        //System.out.println("Greattest Number is "+x);
        System.out.println("Greattest Number is "+new Main().greattest(3,7,6));
    }
}
*/
//Find greattest among 3 nos. from static funciton (within different class) in Java
class Grt
{
    int greattest(int a, int b, int c)
    {
        if(a>b && a>c)
            return a;
        else if(b>c)
            return b; 
        else return c;
    }
}
class Main 
{
    public static void main(String args[])
    {
        System.out.println("Greattest Number is "+new Grt().greattest(3,7,6));
    }
}













