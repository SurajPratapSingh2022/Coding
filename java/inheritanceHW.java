//java inheritance homework
class Student
{
    public String name;
    public int roll, m1, m2, m3;

    void input(String a, int b, int c, int d, int e)
    {
        name = a;
        roll = b;
        m1 = c;
        m2 = d;
        m3 = e;
    }
}

class Mark extends Student
{
    void show()
    {
        System.out.println("Name is " + name + "\t Roll is " + roll);
        System.out.println("m1 = " + m1 + "\t m2 = " + m2 + "\t m3 = " + m3);
    }
}

class Result extends Mark
{
    void getTotal()
    {
        int total = m1 + m2 + m3;
        System.out.println("Total marks is " + total);
    }
}
class Main
{
    public static void main(String args[])
    {
        Result s = new Result();
        s.input("Shivam", 21, 89, 90, 91);
        s.show();
        s.getTotal();
    }
}
// class Main
// {
//     public static void main(String args[])
//     {
//         Student s = new Student();
//         s.input("Shivam", 21, 89, 90, 91);

//         Mark m = new Mark();
//         m.input("Shivam", 21, 89, 90, 91);
//         m.show();

//         Result r = new Result();
//         r.input("Shivam", 21, 89, 90, 91);
//         r.show();
//         r.getTotal();
//     }
// }