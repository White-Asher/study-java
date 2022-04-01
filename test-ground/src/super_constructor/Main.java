package super_constructor;
class Parent{
    int a;
    Parent(int n){
        a = n;
    }
}
class Child extends Parent{
    int b;
    Child(){
//        super(); 오류발생
        super(5);
        b = 20;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
