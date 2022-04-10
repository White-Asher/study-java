package calendar;

import java.util.Scanner;

class PrintCalendar{
    public void inputYearMonth(){
        Scanner scan = new Scanner(System.in);
        int year = 0;
        int month = 0;

        while(true){
            System.out.println("년도를 입력하세요.(해당 메뉴를 종료하려면 -1을 입력하세요)");
            year = scan.nextInt();
            System.out.println("달을 입력하세요.(해당 메뉴를 종료하려면 -1을 입력하세요)");
            month = scan.nextInt();

            if(month>=1 && month <=12){
                int monthLength = lastDay(year, month);
                int firstDayResult = yearFirstDay(year, monthLength);

                printCal(firstDayResult, monthLength);
            } else if(year == -1 || month == -1){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력하였습니다.");
            }
        }
    }

    void printCal(int firstDayResult, int monthLength){
        System.out.println(" 일 월 화 수 목 금 토");
        System.out.println("--------------------");
        int count = 0;
        for(int i=0;i<firstDayResult;i++) {
            System.out.printf("   ");
            count++;
        }

        for(int i=1; i<=monthLength;i++){
            if(i<10) System.out.printf("  %d",i);
            else System.out.printf(" %d",i);
            count++;
            if(count % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    int lastDay(int y, int m){
        if(m % 2 == 0 ){
            if(m == 2){
                if(y % 4 == 0 && y % 100 !=0  || y % 400 == 0) return 29;
                else return 28;
            }
            else return 30;
        }else return 31;
    }

    int yearFirstDay(int year ,int monthLength){
        int sum = 4;
        for(int i = 1970; i < year; i++){
            if(i % 4 == 0 && i % 100 !=0  || i % 400 == 0){
                sum += 2;
            }
            else sum += 1;
        }
        return sum % 7;
    }
}

//    int monthSum = 0;
//        for(int j = 1;j<=month; j++){
//                int temp = lastDay(year, month);
//                monthSum += (temp % 7);
//                }

public class calMain {
    public static void main(String[] args) {
        PrintCalendar printCalendar = new PrintCalendar();
        printCalendar.inputYearMonth();

    }
}

/*
class Gargabe{
    public void asdasdsa(){
        public void print(){
            Scanner scan = new Scanner(System.in);
            int result =0;
            int month =0;

            while(true){
                System.out.println("달을 입력하세요.");
                month = scan.nextInt();
                if(month>=1 && month <=12){
                    if(month%2 == 0){
                        if(month == 2) result = 28;
                        else result = 31;
                    } else result = 30;
                    System.out.println(month + "월은 " + result + "일까지 있습니다.");
                } else if(month == -1){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else {
                    System.out.println("잘못 입력하였습니다.");
                }
            }
        }
    }
}
 */