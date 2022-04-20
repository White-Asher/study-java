package ch15.p519;
//Thread클래스를 상속해 클래스를 생성한 후 쓰레드 2개 생성
class FileThread extends Thread{
    @Override
    public void run(){
        // 총쏘는 장면
        int[] intArray = {1,2,3,4,5};

        for(int i =0; i<intArray.length;i++){
            System.out.println("(총쏘는 프레임)"+intArray[i]);
            try{ Thread.sleep(200); } catch (InterruptedException e) {}
        }
    }
}
public class CreateAndStartThread_M1C1 {
    public static void main(String[] args) {

        //FileThread 객체 생성 및 시작
        Thread fileThread = new FileThread();
        fileThread.start();

        // 총쏘는 사운드
        String[] stringArray = {"일","이","삼","사","오"};
        try{ Thread.sleep(200); } catch (InterruptedException e) {}

        for(int i =0; i<stringArray.length;i++){
            System.out.println("(사운드 번호)"+stringArray[i]);
            try{ Thread.sleep(200); } catch (InterruptedException e) {}
        }
    }
}
