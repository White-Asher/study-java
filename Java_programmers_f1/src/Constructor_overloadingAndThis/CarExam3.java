package Constructor_overloadingAndThis;

public class CarExam3 {
    public static void main(String[] args) {
        Car c1 = new Car("소방차");
        Car c2 = new Car();
//        기본생성자 Car()가 오류가 발생하지 않음 >> 생성자 오버로딩 가능
        Car c3 = new Car("구급차", 1111);
    }
}
