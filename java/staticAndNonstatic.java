//Access static & Non static Function in Java
class MyClass {
    static void sayHello() 
    {
        System.out.println("Hello!");
    }
    void sayBye()
    {
        System.out.println("Bye");
    }
}
public class Main {
    public static void main(String[] args) {
        MyClass.sayHello();
        MyClass obj=new MyClass();
        obj.sayBye();
    }
}