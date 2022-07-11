package interfaceStaticMethodTest;

public class TestClass {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
        // calculator.print(100);

        Calculator.print(100);
        // 인터페이스의 static 메서드는 반드시 인터페이스 이름.메소드 형식으로 호출해야함.
    }
}
