package calendar;

import java.text.ParseException;
import java.util.Scanner;

public class PromptMenu {
    public void menu() throws ParseException {
        int menuSwitch = 1;
        printMenu();
        while(menuSwitch == 1) {

            System.out.print("명령을 입력하세요 (1, 2, 3, h, q): ");

            PrintCalendar printCalendar = new PrintCalendar();
            Schedule schedule = new Schedule();

            Scanner scan = new Scanner(System.in);
            String menuChoiceVal;
            menuChoiceVal = scan.nextLine();
            switch (menuChoiceVal) {
                case "1":
                    schedule.registerMain();
                    break;
                case "2":
                    schedule.searchMain();
                    break;
                case "3":
                    printCalendar.inputYearMonth();
                    break;
                case "h":
                    printMenu();
                    break;
                case "q":
                    System.out.println("프로그램을 종료합니다.");
                    menuSwitch = 0;
                    break;
                default:
                    System.out.println("잘못된 명령입니다. 다시 입력하세요");
            }
        }
    }
    public void printMenu(){
        System.out.println("=============");
        System.out.println("1. 일정등록 ");
        System.out.println("2. 일정검색 ");
        System.out.println("3. 달력보기 ");
        System.out.println("h: 도움말");
        System.out.println("q: 종료");
        System.out.println("=============");
    }
}
