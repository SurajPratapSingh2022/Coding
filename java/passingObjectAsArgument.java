//passing object as argument (put integer)
class Demo 
{
    private int number;

    void input(int n) 
    {
        number = n;
    }

    void show() 
    {
        System.out.println("Number is " + number);
    }

    void add(int x) 
    {
        number = number + x;
    }
}

class Main {
    public static void main(String args[]) {
        Demo ob = new Demo();
        Demo obj = new Demo();
        obj.input(5);
        obj.show();
        
        obj.add(25); // Pass 25 as a parameter to the add method
        obj.show();
    }
}
