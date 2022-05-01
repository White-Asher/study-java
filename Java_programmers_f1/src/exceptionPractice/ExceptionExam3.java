package exceptionPractice;

public class ExceptionExam3 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try{
            int k = divide(i,j);
            System.out.println(k);
        }catch(Exception e) {
            System.out.println(e.toString());
        }finally {
            System.out.println("end");
        }
    }

    public static int divide(int i, int j) throws IllegalArgumentException{
        if(j == 0){
            throw new IllegalArgumentException("0으로 나눌 수 없다");
        }
        return i/j;
    }
}
