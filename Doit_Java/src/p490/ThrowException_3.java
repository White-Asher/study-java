package p490;

class A{
    void abc(){
        bcd();
    }
    void bcd(){
        try{
            Class cls = Class.forName("java.lang.Object");
            Thread.sleep(1000);
        } catch (InterruptedException | ClassNotFoundException e){
            // 예외 처리 구문
        }
    }
}
class B{
    void abc(){
        try{
            bcd();
        } catch (InterruptedException |ClassNotFoundException e){
            // 예외 처리 구문
        }
    }
    void bcd() throws InterruptedException, ClassNotFoundException{
        Class cls = Class.forName("java.lang.Object");
    }
}
public class ThrowException_3 {
}
