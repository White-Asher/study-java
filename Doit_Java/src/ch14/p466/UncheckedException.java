package ch14.p466;

class A{}
class B extends A{}

public class UncheckedException {
    public static void main(String[] args) {
        // UncheckedException = RuntimeException(실행 예외)

        //1.ArithmeticException
        System.out.println(3/0);

        //2.classCastException
        A a = new A();
        B b = (B)a;

        //3.ArrayIndexOutOfBoundsException
        int[] array = {1,2,3};
        System.out.println(array[3]);

        //4.NumberFormatException
        int num = Integer.parseInt("10!");

        //5.NullPointException
        String str1 = null;
        System.out.println(str1.charAt(2));
    }
}
