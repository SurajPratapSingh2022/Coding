//Returning Object (r=x+y)
class Complex 
{
    private int real, imag;

    void input(int r, int im) {
        real = r;
        imag = im;
    }

    void show() {
        System.out.println(real + "+" + imag + "i");
    }

    Complex add(Complex c1, Complex c2) 
    {
        Complex result = new Complex();
        result.real = c1.real + c2.real;
        result.imag = c1.imag + c2.imag;
        return result;
    }
}

public class Main {
    public static void main(String args[]) {
        Complex cc3 = new Complex();
        Complex cc1 = new Complex();
        Complex cc2 = new Complex();
        cc1.input(100, 200);
        cc2.input(300, 700);
        cc1.show();
        cc2.show();
        
        Complex output = cc3.add(cc1, cc2);
        output.show();
    }
}
