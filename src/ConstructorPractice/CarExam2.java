package ConstructorPractice;

public class CarExam2 {
    public static void main(String[] args) {
//        Car c1 = new Car();
//        기본생성자는 만들어지지 않음 왜냐? 생성자를 따로 만들어서 (원래 기본생성자는 자동생성됨)

        Car c2 = new Car("소방차");
        Car c3 = new Car("구급차");

        System.out.println(c2.name);
        System.out.println(c3.name);

    }
}
