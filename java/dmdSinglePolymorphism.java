//example of DMD
//example of Single Polymorphism
class Demo{
    void show(){
        System.out.println("Hello method demo");
    }
}
class Example extends Demo{
    void show(){
        System.out.println("Bye method example");
    }
}
class Main{
    public static void main(String args[]){
        Demo dd;
        Demo d = new Demo();
        dd=d;
        dd.show();
        
        Example e = new Example();
        dd=e;
        dd.show();
    }
}