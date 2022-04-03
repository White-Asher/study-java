package p442;

interface A{
    public abstract void abc();
}
// 자식 클래스 직접 생성
class B implements A{
    public void abc(){
        System.out.println("입력 매개변수 전달");
    }
}
class C{
    void cde(A a){
        a.abc();
    }
}
public class AnonymousClass_3 {
    public static void main(String[] args) {
        C c = new C();

        // 방법1. 클래스명(O) + 참조변수명(O)
        A a = new B();
        c.cde(a);

        // 방법2. 클래스명(O) + 참조변수명(x)
        c.cde(new B());
    }
}
