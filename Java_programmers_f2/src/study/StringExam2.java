package study;

public class StringExam2 {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1 + str2;
        System.out.println(str3);

        // 문자열과 문자열을 더하게 되면 내부적으로는 다음과 같은 코드가 실행
        String string4 = new StringBuffer().append(str1).append(str2).toString();

        System.out.println(string4);
        //문자열을 반복문 안에서 더하는 것은 성능상 문제가 생길 수 있으니 반드시 피하도록 합시다.

        String str5 = "";
        for(int i = 0; i< 100; i++){
            str5 = str5 + "*";
        }
        System.out.println(str5);

        StringBuffer sb2 = new StringBuffer();
        for(int i= 0; i <100;i++){
            sb2.append("*");
        }
        String str6 = sb2.toString();
        System.out.println(str6);


        // (1) String의 +연산을 이용해서 10,000개의 *를 이어붙입니다.
        //시작시간을 기록합니다.(millisecond단위)
        long startTime1 = System.currentTimeMillis();
        String str="";
        for(int i=0;i<10000;i++){
            str=str+"*";
        }
        //종료시간을 기록합니다.(millisecond단위)
        long endTime1 = System.currentTimeMillis();

        // (2) StringBuffer를 이용해서 10,000개의 *를 이어붙입니다.
        //시작시간을 기록합니다.(millisecond단위)
        long startTime2 = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<10000;i++){
            sb.append("*");
        }
        //종료시간을 기록합니다.(millisecond단위)
        long endTime2 = System.currentTimeMillis();

        // 방법(1)과 방법(2)가 걸린 시간을 비교합니다.
        long duration1 = endTime1-startTime1;
        long duration2 = endTime2-startTime2;

        System.out.println("String의 +연산을 이용한 경우 : "+ duration1);
        System.out.println("StringBuffer의 append()을 이용한 경우 : "+ duration2);

    }
}
