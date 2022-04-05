package p525;
public class CreateAndStartThread_M2C3 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run(){
                // 총쏘는 장면
                int[] intArray = {1,2,3,4,5};

                for(int i =0; i<intArray.length;i++){
                    System.out.println("(총쏘는 프레임)"+intArray[i]);
                    try{ Thread.sleep(200); } catch (InterruptedException e) {}
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
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
        });

        thread1.start();
        thread2.start();
    }
}

