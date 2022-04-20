package ch15.p520;

class FrameThread extends Thread{
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

class SoundThread extends Thread{
    @Override
    public void run(){
        // 총쏘는 장면
        String[] stringArray = {"일","이","삼","사","오"};
        try{ Thread.sleep(200); } catch (InterruptedException e) {}

        for(int i =0; i<stringArray.length;i++){
            System.out.println("(사운드 번호)"+stringArray[i]);
            try{ Thread.sleep(200); } catch (InterruptedException e) {}
        }
    }
}

public class CreateAndStartThread_M1C2 {
    public static void main(String[] args) {

        //FrameThread 객체 생성 및 시작
        Thread frameThread = new FrameThread();
        frameThread.start();

        //SoundThread 객체 생성 및 시작
        Thread soundThread = new SoundThread();
        soundThread.start();
    }
}