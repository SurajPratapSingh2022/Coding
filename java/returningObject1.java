//returning object (x=x+y)
class Demo 
{
    private int real, img;

    void input(int x1, int y1) 
    {
        real = x1;
        img = y1;
    }

    void show() 
    {
        System.out.println(real + "+" + img + "i");
    }

    Demo add(Demo c) 
    {
        Demo rr = new Demo();
        rr.real = real + c.real;
        rr.img = img + c.img;
        return rr;
    }
}

class Complex {
    public static void main(String[] args) 
    {
        Demo dd1 = new Demo();
        Demo dd2 = new Demo();
        dd1.input(100, 200);
        dd2.input(300, 500);

        dd1.show();
        dd2.show();

        Demo sum = dd1.add(dd2);
        sum.show();
    }
}