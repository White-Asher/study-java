package exceptionPractice;

public class ExceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = i / j;
            System.out.println(k);
            System.out.println("main end!!");
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없다. "+ e.toString());
        } finally {
            System.out.println("finally");
        }
        System.out.println("종료");
    }
}
