package calendar;

import java.util.Scanner;

public class PromptMenu {
    public void menu() {
        int menuSwitch = 1;
        while(menuSwitch == 1) {
            System.out.println("=============");
            System.out.println("1. 일정등록 ");
            System.out.println("2. 일정검색 ");
            System.out.println("3. 달력보기 ");
            System.out.println("h: 도움말");
            System.out.println("q: 종료");
            System.out.println("=============");
            System.out.print("명령을 입력하세요 (1, 2, 3, h, q): ");

            PrintCalendar printCalendar = new PrintCalendar();

            Scanner scan = new Scanner(System.in);
            String menuChoiceVal;
            menuChoiceVal = scan.nextLine();
            switch (menuChoiceVal) {
                case "1":

                case "2":

                case "3":
                    printCalendar.inputYearMonth();
                    break;
                case "h":

                case "q":
                    System.out.println("프로그램을 종료합니다.");
                    menuSwitch = 0;
                    break;
                default:
                    System.out.println("잘못된 명령입니다. 다시 입력하세요");
            }
        }
    }
}
