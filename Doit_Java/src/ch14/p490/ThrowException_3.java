package ch14.p490;

class A{
    void aaa(){
        bbb();
    }
    void bbb(){
        try{
            Class cls = Class.forName("java.lang.Object");
            Thread.sleep(1000);
        } catch (InterruptedException | ClassNotFoundException e){
            // 예외 처리 구문
        }
    }
}
class B{
    void aaa(){
        try{
            bbb();
        } catch (InterruptedException |ClassNotFoundException e){
            // 예외 처리 구문
        }
    }
    void bbb() throws InterruptedException, ClassNotFoundException{
        Class cls = Class.forName("java.lang.Object");
    }
}
public class ThrowException_3 {
}
