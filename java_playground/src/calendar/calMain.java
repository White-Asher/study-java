package calendar;

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