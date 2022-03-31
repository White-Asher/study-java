import java.util.Scanner;

public class AccountApp {
    public static void main(String[] args) {

        Account account = new Account("312-89562-123456");

        Scanner sc = new Scanner(System.in);
        int menuNum = 1;

        do{
            System.out.println("1.예금, 2.출금, 3.잔고, 4.종료");
            menuNum = sc.nextInt();

            switch (menuNum){
                case 1:
                    System.out.println("입금할 금액을 입력하세요:");
                    int inputNum = sc.nextInt();
                    System.out.println(account.deposit(inputNum));
                    break;
                case 2:
                    System.out.println("출금할 금액을 입력하세요");
                    int outputNum = sc.nextInt();
                    System.out.println(account.withdraw(outputNum));
                    break;
                case 3:
                    System.out.println("현재 가지고 있는 금액은");
                    account.showBalance();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("다시 입력하세요!");
                    break;
            }
        }while(menuNum != 4);
    }
}

class Account{
    private String accountNum;
    private int accountMoney = 0;

    public Account(String accountNum){
        this.accountNum = accountNum;
    }

    public int deposit(int inputMoney){
        this.accountMoney += inputMoney;
        return this.accountMoney;
    }

    public int withdraw(int outputMoney){
        this.accountMoney -= outputMoney;
        return this.accountMoney;
    }

    public void showBalance(){
        System.out.println(this.accountMoney);
    }
}