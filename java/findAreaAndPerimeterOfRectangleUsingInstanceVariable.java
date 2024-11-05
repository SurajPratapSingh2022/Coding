//Find area & perimeter of rectangle using class when instance variable is blank
import java.util.Scanner;
class Rect 
{
    private int len, bre;
    void input()
    {
        System.out.println("Enter length & breath: \n");
        //User Inputing
        System.out.println("User Inputing");
        Scanner obj = new Scanner(System.in);
        int l=obj.nextInt();
        int b=obj.nextInt();
        len=l;
        bre=b;
        //Value Assign
        // len=2;
        // bre=3;
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
        Rect rr = new Rect();
        rr.input();
        rr.show();
        rr.getArea();
        rr.getPeri();
    }
}