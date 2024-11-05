//Passing Object as argument (y=x+y)
class Complex
{
    private int real, imag;
    void input(int r, int im)
    {
        real = r;
        imag = im;
    }
    void show()
    {
        System.out.println(real+"+"+imag+"i");
    }
    void add(Complex c)
    {
        c.real = real + c.real;
        c.imag = imag + c.imag;
    }
}
class Main
{
    public static void main(String args[])
    {
        Complex cc1 = new Complex();
        Complex cc2 = new Complex();
        cc1.input(100,200);
        cc2.input(300,700);
        cc1.show();
        cc2.show();
        System.out.println("");
        cc1.add(cc2);
        cc1.show();
        cc2.show();
    }
}