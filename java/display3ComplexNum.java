//Prog to store & display 3 complex number
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
}
class Main
{
    public static void main(String args[])
    {
        Complex cc1 = new Complex();
        Complex cc2 = new Complex();
        Complex cc3 = new Complex();
        cc1.input(100,500);
        cc2.input(200,700);
        cc3.input(450,250);
        cc1.show();
        cc2.show();
        cc3.show();
    }
}



