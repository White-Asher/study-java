package calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Date;

public class Schedule {
    public static HashMap <Date, String> planSave = new HashMap<Date, String>();

    Scanner scan = new Scanner(System.in);
    String date = new String();
    String plan = new String();

    public void registerMain() throws ParseException {
        System.out.println("날짜를 입력하세요");
        date = scan.nextLine();
        System.out.println("일정을 입력하세요");
        plan = scan.nextLine();
        registerDate(date, plan);
        System.out.println("일정이 등록되었습니다.");
    }

    public void registerDate(String strDate, String plan) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-mm-dd").parse(strDate);
        planSave.put(date, plan);
        System.out.println(planSave);
    }

    public void searchMain() throws ParseException{
        System.out.println("검색할 날짜를 입력하세요");
        date = scan.nextLine();
        System.out.println(scheduleSearchMain(date));
    }

    public String scheduleSearchMain(String strDate) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-mm-dd").parse(strDate);
        String plan = planSave.get(date);
        return plan;
    }
}
