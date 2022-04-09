package gugudan;

import java.util.Scanner;
class gugudanMain{
    public static int[][] culculator(int times1,int times2){
        int[][] result = new int[times1][times2];
        for(int i=0;i<times1;i++){
            for(int j=0;j<times2;j++){
                result[i][j] = (i+2)*(j+1);
            }
        }
        return result;
    }

    public static void print(){
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("출력할 단을 입력하세요 (종료하려면 0을 입력하세요): ");
            String inputValue = scan.nextLine();
            String[] splitValue = inputValue.split(",");
            int i1 = Integer.parseInt(splitValue[0]);
            int i2 = Integer.parseInt(splitValue[1]);

            if(i1>=2 && i1<=9){
                int[][] gugudan = culculator(i1,i2);
                for(int i=0;i<i1;i++){
                    for(int j=0;j<i2;j++){
                        System.out.println((i+2)+"*"+(j+1)+"="+gugudan[i][j]);
                    }
                }
            }else if(i1 == 0) {
                System.out.println("프로그램이 종료되었습니다");
                break;
            } else{
                System.out.println("다시 입력해 주세요");
            }
        }while (true);
    }
}

public class gugudan {
    public static void main(String[] args) {
        gugudanMain gugugu = new gugudanMain();
        gugugu.print();
    }
}
