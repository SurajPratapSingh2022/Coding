//example of abstract class
abstract class Shape
{
    int x, y;
    Shape(int a, int b)
    {
        x = a;
        y = b;
    }
    
    abstract void getArea();
}

class Rect extends Shape 
{
    Rect(int m, int n)
    {
        super(m, n);
    }

    void getArea()
    {
        System.out.println("Area is " + x * y);
    }
}

class Circle extends Shape 
{
    Circle(int r)
    {
        super(r, 0);
    }

    void getArea()
    {
        System.out.println("Area is " + Math.PI * x * x);
    }
}

class Main 
{
    public static void main(String args[])
    {
        Rect rr = new Rect(5, 10);
        rr.getArea();
        
        Circle cc = new Circle(7);
        cc.getArea();
    }
}
