package StringClassMethod;

public class StringMethodExam {
    public static void main(String[] args){
//        String str = new String("hello");
        String str = "hello world";
        str.length();
        System.out.println(str.length());
        System.out.println(str.concat((" world")));
        System.out.println(str);
        str = str.concat(" world");
        System.out.println(str);

        System.out.println(str.substring(3));
        System.out.println(str.substring(3,6));
    }
}
//str.concat("world") 메소드는 str 이 참조하는 문자열 hello 에다가 메소드의 인자로 들어온 문자열 world 를 붙혀서 String 타입으로 리턴하는 메소드다.
//String Class는 불변 클래스로, 메소드가 수행되면, 새로운 문자열을 만든다. 그러므로, 원래 클래스는 변하지 않는다.