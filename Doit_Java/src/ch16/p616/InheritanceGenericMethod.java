package ch16.p616;

class Parents{
    <T extends Number> void print(T t){
        System.out.println(t);
    }
}
class Child extends Parents{}
public class InheritanceGenericMethod {
    public static void main(String[] args) {
        Parents p = new Parents();
        p.<Integer>print(10);
        p.print(10);

        Child c = new Child();
        c.<Double>print(5.8);
        c.print(5.8);
    }
}
