package p487;
// 하위 메서드에 직접 예외를 처리할 때
class A{
    void abc(){
        bcd();
    }
    void bcd(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            // 예외 처리 구문
        }
    }
}
// 예외를 호출 메서드로 전가할 때
class B{
    void abc(){
        try{
            bcd();
        }catch (InterruptedException e){
            //예외 처리구문
        }
    }
    void bcd() throws InterruptedException{
        Thread.sleep(1000);
    }
}
public class ThrowException {
    public static void main(String[] args) {

    }
}
