package ch15.p548;

class MyData {
    // this 객체가 갖고 있는 하나의 key를 함께 사용
    synchronized void aaa() {
        for(int i=0; i<3; i++) {
            System.out.println(i + "sec");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }

    // this 객체가 갖고 있는 하나의 key를 함께 사용
    synchronized void bbb() {
        for(int i=0; i<3; i++) {
            System.out.println(i + "초");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }

    // this 객체가 갖고 있는 하나의 key를 함께 사용
    void ccc() {
        synchronized(this) {
            for(int i=0; i<3; i++) {
                System.out.println(i + "번째");
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        }
    }
}

public class KeyObject_1 {
    public static void main(String[] args) {
        //공유객체
        MyData myData = new MyData();

        //세개의 쓰레드가 각각의 메서드 호출
        new Thread() {
            public void run() {
                myData.aaa();
            };
        }.start();

        new Thread() {
            public void run() {
                myData.bbb();
            };
        }.start();

        new Thread() {
            public void run() {
                myData.ccc();
            };
        }.start();
    }
}
