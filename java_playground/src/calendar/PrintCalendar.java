package calendar;

import java.util.Scanner;

public class PrintCalendar{
    public void inputYearMonth(){
        Scanner scan = new Scanner(System.in);
        int year = 0;
        int month = 0;

        while(true){
            System.out.println("년도를 입력하세요.(해당 메뉴를 종료하려면 -1을 입력하세요)");
            year = scan.nextInt();
            if(year == -1) {
                System.out.println("달력 출력 메뉴를 종료합니다.");
                break;
            }
            System.out.println("달을 입력하세요.");
            month = scan.nextInt();

            if(month>=1 && month <=12){
                int firstYearDay = yearFirstDay(year);
                int firstMonthDay = monthFirstDay(year, month, firstYearDay);
                int monthLength = lastDay(year, month);
                print(year, month, firstMonthDay, monthLength);
            } else {
                System.out.println("잘못 입력하였습니다.");
            }
        }
    }

    void print(int year, int month, int firstDayResult, int monthLength){
        System.out.println(year+"년 "+month+"월");
        System.out.println("  일 월 화 수 목 금 토");
        System.out.println("----------------------");
        int count = 0;
        for(int i=0; i<firstDayResult; i++) {
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
        int result = 0;
        switch (m){
            case 2:
                if(y % 4 == 0 && y % 100 !=0  || y % 400 == 0) result = 29;
                else result = 28;
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                result = 31;
                break;
            case 4: case 6: case 9: case 11:
                result = 30;
                break;
        }return result;
    }

    int yearFirstDay(int year){
        final int START_DAY = 4;
        final int START_YEAR = 1970;

        int sum = START_DAY;
        for(int i = START_YEAR; i < year; i++){
            if(i % 4 == 0 && i % 100 !=0  || i % 400 == 0){
                sum += 2;
            }
            else sum += 1;
        }
        return sum % 7;
    }

    int monthFirstDay(int year, int month, int firstDayResult){
        int monthSum = 0;
        if (month == 1){
            return firstDayResult;
        } else{
            for(int j = 1; j<month; j++){
                int temp = lastDay(year, j);
                monthSum += (temp % 7);
            }
            return (firstDayResult+monthSum)%7;
        }
    }
}