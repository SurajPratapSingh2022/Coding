//example of multiple inheritance through interface in Java
interface Num1 {
    void input(int a);

    void show();

    int getX();
}
interface Num2 extends Num1 {
    void getData(int a);

    void display();

    int getY();
}
interface Sum extends Num2 {
    void getSum();
}
class MyImplementer implements Sum {
    private int x;
    private int y;
    //@Override
    public void input(int a) {
        x = a;
    }
    //@Override
    public void getData(int a) {
        y = a;
    }
    //@Override
    public void show() {
        System.out.println("x is " + x);
    }
    //@Override
    public void display() {
        System.out.println("y is " + y);
    }
    //@Override
    public int getX() {
        return x;
    }
    //@Override
    public int getY() {
        return y;
    }
    //@Override
    public void getSum() {
        int r = getX() + getY();
        System.out.println("Sum is " + r);
    }
}
public class Main {
    public static void main(String args[]) {
        MyImplementer ss = new MyImplementer();
        ss.input(50);
        ss.getData(150);
        ss.show();
        ss.display();
        ss.getSum();
    }
}
