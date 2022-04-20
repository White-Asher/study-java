package ch9.p301;

class A{
    int a;
    static int b;
    static{
        b = 5;
        System.out.println("클래스 a가 로딩되었습니다.");
    }
    A(){
        a = 3;
    }
}

class B{
    int c;
    static int d;
    static{
        d = 5;
        System.out.println("클래스 B가 로딩되었습니다.");
    }
    B(){
        c = 3;
    }
}

public class StaticInitalBlock {
    public static void main(String[] args) {
        System.out.println(A.b);
        System.out.println(B.d);
    }
}
