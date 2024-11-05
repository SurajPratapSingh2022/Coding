//8.) WAP a prg to create a class employee having data member name, id, add & salary. 
//    Take appropriate member function to store and display the details of three employees.
class Emp
{
    private String name,add; private int id, salary; 
    void input(String n, String a, int i, int s)
    {
        name = n;
        add = a;
        id = i;
        salary = s;
    }
    void show()
    {
        System.out.println("Name: "+name+"\t Address: "+add+"\t id: "+id+"\t Salary: "+salary);
    }
}
class Main 
{
    public static void main(String args[])
    {
        Emp e1 = new Emp();
        e1.input("sps","Kumhrar",57,8000);
        e1.show();
        Emp e2 = new Emp();
        e2.input("Shivam","Boring Road",21,10000);
        e2.show();
        Emp e3 = new Emp();
        e3.input("Saurav","RK Nagar",18,12000);
        e3.show();
    }
}

