package day7;
import day6.Oop1a;
public class Main2 {
    public static void main(String[] args) {
        Bank arr[] = {new Bank(50000,"han","11111111111")};
        for (int i =0; i<arr.length;i++){
            System.out.println(arr[i].name);
            System.out.println(arr[i].accountNum);
            System.out.println(arr[i].balance);
            arr[i].deposit(00000);
            arr[i].withdraw(50000);

        }
    }
}
