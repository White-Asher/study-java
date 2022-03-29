package chapter_7_Problem;

class A{
    void print(){
        System.out.println("입력값이 없습니다.");
    }
    void print(int i){
        System.out.println("정수 입력값 : "+i);
    }
    void print(double i){
        System.out.println("실수 입력값 : "+i);
    }
    void print(String s){
        System.out.println("문자열 입력값 : "+s);
    }
}

public class problem2 {
    public static void main(String[] args) {
        A a = new A();
        a.print();
        a.print(3);
        a.print(5.8);
        a.print("안녕");
    }
}
