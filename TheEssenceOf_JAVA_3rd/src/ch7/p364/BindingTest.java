package ch7.p364;
/*
메서드의 경우 조상 클래스의 메서드는 자손의 클래스에서 오버라이딩한 경우
참조 변수의 타입에 관계없이 항상 실제 인스턴스의 메서드(오버라이딩된 메서드)가
호출되지만, 멤버변수의 경우 참조변수의 타입에 따라 달라진다.

멤버변수가 조상 클래스와 자손 클래스에 중복으로 정의된 경우,
조상타입의 참조변수를 사용했을 때는 조상 클래스에 선언된 멤버변수가 사용되고,
자손타입의 참조변수를 사용했을 때는 자손 클래스에 선언된 멤버변수가 사용된다.
 */

public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = "+ c.x);
        c.method();
    }
}

class Parent{
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}

class Child extends Parent{
    int x = 200;
    void method(){
        System.out.println("Child Method");
    }
}
