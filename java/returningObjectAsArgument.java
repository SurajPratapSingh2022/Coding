//returning Object as argument (r=x+y) in Java
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
    Complex add(Complex c1, Complex c2)
    {
        c1.real = c1.real + c2.real;
        c1.imag = c1.imag + c2.imag;
        return c1;
    }
    
}
class Main
{
    public static void main(String args[])
    {
        Complex cc3 = new Complex();
        Complex cc1 = new Complex();
        Complex cc2 = new Complex();
        cc1.input(100,200);
        cc2.input(300,700);
        cc1.show();
        cc2.show();
        System.out.println("");
        cc3 = cc3.add(cc1,cc2);
        cc3.show();
    }
}