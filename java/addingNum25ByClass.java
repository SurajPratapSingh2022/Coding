//adding number by 25 by class
class Demo
{
    private int number;
    void input(int n)
    {
        number = n;
    }
    void show()
    {
        System.out.println("Number is "+number);
    }
    void add()
    {
        number = number + 25;
        System.out.println("New Number is "+number);
    }
}
class Main 
{
    public static void main(String args[])
    {
        Demo obj = new Demo();
        obj.input(5);
        obj.show();
        obj.add();
    }
}