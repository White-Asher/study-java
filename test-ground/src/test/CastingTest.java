package test;
class Parents{

}
class Child extends Parents{

}
public class CastingTest {
    public static void main(String[] args) {
        Child child = new Child();
        Parents parents = child;
    }
}
