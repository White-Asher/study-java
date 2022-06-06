package test;

public class testCase {
    public static void main(String[] args) {
//        byte p = 10;
        byte p = -10;

        System.out.printf("p = %d \t\t%s%n", p, toBinaryString(p));
        System.out.printf("~p = %d \t%s%n", ~p, toBinaryString(~p));
        System.out.printf("~p + 1 = %d \t%s%n", ~p + 1, toBinaryString(~p + 1));
        System.out.printf("~~p = %d \t%s%n", ~~p, toBinaryString(~~p));
    }

    static String toBinaryString(int x) {
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length() - 32);
    }
}

