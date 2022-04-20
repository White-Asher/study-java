package ch5.p197;

public class PlusOperationOfString {
    public static void main(String[] args) {
        String str1 = "안녕" + "하세요" +"!";
        System.out.println(str1);


        String str3 = "안녕" + 1;
        String str4 = "안녕" + String.valueOf(1);
        String str5 = "안녕" + "1";

        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println();



    }
}
