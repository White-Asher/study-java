package day6;

public class Oop1b {
    public static void main(String[] args) {
        Oop1a obj = new Oop1a();
        obj.accountNum = "111-111-1111";
        obj.name = "han";
        obj.balance = 200000;

        System.out.println("계좌번호:"+obj.accountNum);
        System.out.println("이름:"+obj.name);
        System.out.println("잔액:"+obj.name);

        obj.deposit(0);
        obj.withdraw(100000);
    }
}
