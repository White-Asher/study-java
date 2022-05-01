package study;

public class StringBufferExam {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");

        String str = sb.toString();
        System.out.println(str);

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("hello");
        if(sb2 == sb3)
            System.out.println("sb2 == sb3");
        //자기 자신의 메소드를 호출하여 자기 자신의 값을 바꿔나가는 것을 메소드체이닝

        String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
        System.out.println(str2);
        //StringBuffer는 append메소드 외에도 길이를 구하거나, 자르거나 등의 다양한 메소드들을 가지고 있습니다.
    }
}
