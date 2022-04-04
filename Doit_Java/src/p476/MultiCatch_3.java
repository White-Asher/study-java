package p476;

import java.io.IOException;
import java.io.InputStreamReader;

public class MultiCatch_3 {
    public static void main(String[] args) {
        // 1.catch 블록을 각각 처리했을 때
        try{
            System.out.println(3/1);
            int num = Integer.parseInt("10A");
        } catch (ArithmeticException e) {
            System.out.println("예외가 발생했습니다");
        } catch (NumberFormatException e) {
            System.out.println("예외가 발생하였습니다.");
        }

        // 2.catch 블록을 하나로 통합했을 때
        try{
            System.out.println(3/1);
            int num = Integer.parseInt("10A");
        } catch (ArithmeticException | NumberFormatException e){
            System.out.println("예외가 발생했습니다");
        }

        InputStreamReader is = null;
        try {
            is = new InputStreamReader(System.in);
            System.out.println(is.read());
        } catch (IOException e){
            // 예외 처리
        } finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e){
                    //예외처리
                }
            }
        }
//        try (inputStreamReader is = new InputStreamReader(System.in);){
//            System.out.println(is.read());
//        } catch (IOException e){
//            //  예외처리
//        }
    }
}
