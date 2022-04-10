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
                int firstDayResult = firstDay(year);
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
    }

    int lastDay(int y, int m){
        if(m%2 == 0){
            if(m == 2) return 30;
            else return 31;
        } else {
            if(y % 4 == 0) return 29;
            else return 28;
        }
    }

    int firstDay(int year){
        int sum = 0;
        for(int i = 1583; i<year; i++){
            if(year % 4 == 0){
                sum += 2;
            } else sum += 1;
        }
        return sum / 7;
    }
}

public class calMain {
    public static void main(String[] args) {



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