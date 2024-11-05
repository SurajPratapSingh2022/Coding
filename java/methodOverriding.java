//Example of Method Overriding in Java
class A{
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
}
class B extends A{
    @Override
    public void meth1(){
        System.out.println("I am method 1 of class B");
    }
}
public class Main{
    public static void main(String[] args) {
        B b = new B();
        b.meth1();
    }
}
