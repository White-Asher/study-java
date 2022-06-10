package ch7.p366;

public class BingTest3 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println();
        System.out.println("c.x = "+ c.x);
        c.method();
    }
}

class Parent{
    int x = 100;
    void method(){
        System.out.println("Parent method");
    }
}

class Child extends Parent{
    int x = 200;
    void method(){
        System.out.println("x = " + x);
        System.out.println("super = "+super.x);
        System.out.println("this = "+this.x);
    }
}
