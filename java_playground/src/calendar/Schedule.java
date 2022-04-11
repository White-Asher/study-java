package calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Date;

public class Schedule {
    private HashMap<Date, String> planSave;
    public void registerMain() throws ParseException {
        Scanner scan = new Scanner(System.in);
        planSave = new HashMap<Date, String>();

        String date = new String();
        String plan = new String();

        System.out.println("날짜를 입력하세요");
        date = scan.nextLine();
        System.out.println("일정을 입력하세요");
        plan = scan.nextLine();
        registerDate(date, plan);

        System.out.println("일정이 등록되었습니다.");
    }
    public void registerDate(String strDate, String plan) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-mm-dd").parse(strDate);
//        System.out.println(date);
//        System.out.println(plan);
        planSave.put(date, plan);
    }

    public void scheduleSearchMain(String strDate) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-mm-dd").parse(strDate);
    }
}
