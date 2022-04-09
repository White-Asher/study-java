package calendar;

import java.util.Scanner;

public class calMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("반복 횟수를 입력하세요:");
        int count = scan.nextInt();

        int[] result = new int[count];
        int[] month = new int[count];

        int i =0;
        while(i != count){
            System.out.println("달을 입력하세요.");
            month[i] = scan.nextInt();
            if(month[i]>=1 && month[i] <=12){
                if(month[i]%2 == 0){
                    if(month[i] == 2) result[i] = 28;
                    else result[i] = 31;
                } else result[i] = 30;
                System.out.println(month[i] + "월은 " + result[i] + "일까지 있습니다.");
            }

            else {
                i--;
                System.out.println("잘못 입력하였습니다.");
            }
        }


//        System.out.println(" 일 월 화 수 목 금 토");
//        System.out.println("--------------------");
//        System.out.println(" 1  2  3  4  5  6  7");
//        System.out.println(" 8  9 10 11 12 13 14");
//        System.out.println("15 16 17 18 19 20 21");
//        System.out.println("22 23 24 25 26 27 28");

//        System.out.println("두 수를 입력하세요");
//        Scanner scan = new Scanner(System.in);
//        String inputValue = scan.nextLine();
//        String[] splitValue = inputValue.split(" ");
//        int first = Integer.parseInt(splitValue[0]);
//        int second = Integer.parseInt(splitValue[1]);
//        System.out.println("두수의 합은"+(first+second)+"입니다");

    }
}
