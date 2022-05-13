package lecture37Field;

class Field{
    static int classVar = 10; // 클래스 변수 선언
    int instanceVar = 20; // 인스턴스 변수 선언
}

public class Member01 {
    public static void main(String[] args) {
        int var = 30;
        System.out.println(var + "\n");

        // 인스턴스 생성
        Field myfield1 = new Field();
        Field myfield2 = new Field();

        // 클래스 변수의 값을 변경 하고 값 확인
        System.out.println(Field.classVar); // 보통 클래스 변수는 이렇게 선언
        System.out.println(myfield1.classVar);
        System.out.println(myfield2.classVar + "\n");

        myfield1.classVar = 100;

        System.out.println(Field.classVar); // 보통 클래스 변수는 이렇게 선언
        System.out.println(myfield1.classVar);
        System.out.println(myfield2.classVar + "\n");


        //인스턴스 변수 값 변경하고 확인
        System.out.println(myfield1.instanceVar);
        System.out.println(myfield2.instanceVar);

        myfield1.instanceVar = 200;

        System.out.println(myfield1.instanceVar);
        System.out.println(myfield2.instanceVar);

    }
}
