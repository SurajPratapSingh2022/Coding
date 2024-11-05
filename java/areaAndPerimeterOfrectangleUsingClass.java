//Find area & perimeter of rectangle using class
import java.util.Scanner;
class Rect 
{
    private int len, bre;
    void input(int l, int b)
    {
        len=l;
        bre=b;
    }
    void show()
    {
        System.out.println("Length is "+len+"\nBredth is "+bre);
    }
    void getArea()
    {
        System.out.println("Area is "+(len*bre));
    }
    void getPeri()
    {
        int s;
        s=2*(len+bre);
        System.out.println("Perimeter is "+s);
    }
}
class Main 
{
    public static void main(String args[])
    {
        System.out.println("Enter length & breath: \n");
        //User Inputing
        System.out.println("User Inputing");
        Rect rr = new Rect();
        Scanner obj= new Scanner(System.in);
        int x=obj.nextInt();
        int y=obj.nextInt();
        rr.input(x,y);
        rr.show();
        rr.getArea();
        rr.getPeri();
        //Assign Value
        System.out.println("\nAssigning");
        Rect rr1 = new Rect();
        rr1.input(10,20);
        rr1.show();
        rr1.getArea();
        rr1.getPeri();
        obj.close();
    }
}