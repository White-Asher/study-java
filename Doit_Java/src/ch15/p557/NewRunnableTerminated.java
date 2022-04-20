package ch15.p557;

public class NewRunnableTerminated {
    public static void main(String[] args) {
        // 쓰레드 상태 저장 클래스 
        Thread.State state;

        // 1. 객체 생성 (NEW)
        Thread myThread = new Thread() {
            @Override
            public void run() {
                for(long i=0; i<1000000000L ; i++) {} //시간지연하기 위한 반복문
            }
        };
        state = myThread.getState();
        System.out.println("myThread state = "+ state); // NEW 상태

        // 2. myThread 시작
        myThread.start();
        state = myThread.getState();
        System.out.println("myThread state = "+ state); //Runnable 상태

        // 3. myThread 종료
        try {
            myThread.join();
        } catch (InterruptedException e) {	}

        state = myThread.getState();
        System.out.println("myThread state = "+ state); //TERMINATED 상태	
    }
}