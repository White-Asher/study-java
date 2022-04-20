package ch15.p524;
//Runnable 인터페이스 상속 클래스를 생성한 후 쓰레드 3개 생성
class FrameRunnable implements Runnable {
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

class SoundRunnable implements Runnable{
    @Override
    public void run(){
        // 총쏘는 사운드
        String[] stringArray = {"일","이","삼","사","오"};
        try{ Thread.sleep(200); } catch (InterruptedException e) {}

        for(int i =0; i<stringArray.length;i++){
            System.out.println("(사운드 번호)"+stringArray[i]);
            try{ Thread.sleep(200); } catch (InterruptedException e) {}
        }
    }
}

public class CreateAndStartThread_M2C2 {
    public static void main(String[] args) {

        //FrameThread 객체 생성
        Runnable frameRunnable = new FrameRunnable();
        // frameRunnable.start() // Runnable객체에는 start()메서드가 없어 오류 발생
        Thread thread1 = new Thread(frameRunnable);
        thread1.start();

        //SoundRunnable 객체 생성
        Runnable soundRunnable = new SoundRunnable();
        Thread thread2 = new Thread(soundRunnable);
        thread2.start();
    }
}