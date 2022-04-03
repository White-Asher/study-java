package day7;

public class Bank {
    int balance;
    String name;
    String accountNum;

    public Bank(){ }

    //생성자 오버로딩
   public Bank(int balance, String name, String accountNum){
        this.balance = balance;
        this.name = name;
        this.accountNum = accountNum;
    }

//    입금
    public void deposit(int amount){
        balance += amount;
        System.out.println("현재 잔고 : " + balance);
    }

    public int withdraw(int amount){
        if(balance<amount){
            System.out.println("잔액이 부족합니다.");
            System.out.println("현재 잔액 : " + balance);
            return 0;
        }
        balance -=amount;
        System.out.println("현재잔액 : "+balance);
        return amount;
    }
}
