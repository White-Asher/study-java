package p514;

public class TheNeedForThread {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        String[] stringArray = {"일","이","삼","사","오"};

        for(int i =0; i<intArray.length;i++){
            System.out.println("(총쏘는 프레임)"+intArray[i]);
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {}
        }

        for(int i =0; i<stringArray.length;i++){
            System.out.println("(사운드 번호)"+stringArray[i]);
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {}
        }
    }
}
